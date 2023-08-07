package Threed1;


public class Happy {
    public static void main(String[] args) {
        Love i=(a)->{
            System.out.println(a);
        };
        i.Ilove(3);


    }

}
interface Love{
    public void Ilove(int a);
}
//class Ilove implements Love{
//    @Override
//    public void Ilove(int a) {
//        System.out.println(" i love "+ a);
//    }
//}
