package Threed1;

public class Produce_Consume {
    public static void main(String[] args) {
        SynoContainer container =new SynoContainer();

        Produce p1=new Produce(container);

        p1.start();


        Consume p2=new Consume(container);

        p2.start();




    }
}
class Produce extends Thread{
    SynoContainer container;

    public Produce(SynoContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了第"+i+"鸡");
            container.push(new Chicken(i));

        }
    }


}
class Consume extends Thread{
     SynoContainer container;

    public Consume(SynoContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("吃了第"+container.pop().id+"鸡");

        }
    }

}
class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
class SynoContainer{
    Chicken[] chickens=new Chicken[10];

    int counts=0;

    //生产者生产鸡，并且放进管道
    public synchronized void push(Chicken chicken){
        if(counts==chickens.length-1){
            try{
                System.out.println("管道满了");
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();

            }


        }

            chickens[counts]=chicken;
            counts++;
            //通知
            this.notifyAll();


    }
    public synchronized Chicken pop(){
        if(counts==0){
            try{
                System.out.println("没有寄！");
                this.wait();

            }catch (InterruptedException e){
                e.printStackTrace();

            }


        }else{

            counts--;

            Chicken chicken=chickens[counts];

            this.notifyAll();

            return chicken;
        }



            //通知

        return null;


    }
}
