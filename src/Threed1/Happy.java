package Threed1;

class threed implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("vip来了"+i);
        }
    }
}
public class Happy {
    public static void main(String[] args) throws InterruptedException {
       threed t1=new threed();
      Integer a1=127;
      Integer a2=127;
        System.out.println(a1==a2);
        Sold_pocket s1=new Sold_pocket();
        new Thread(s1,"lyh").start();
        new Thread(s1,"wjx").start();

    }

}
class Sold_pocket implements Runnable{
    private int piao=10;

    @Override
    public void run() {
        while(piao>0){
            System.out.println(Thread.currentThread().getName()+"买到了票"+piao--);

        }

    }
}

//class Ilove implements Love{
//    @Override
//    public void Ilove(int a) {
//        System.out.println(" i love "+ a);
//    }
//}

