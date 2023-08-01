package LeetCode1;

class ShuShiAdd_Solution{
    public String Add_TWO_ShuShi(String a,String b){
        int i=a.length()-1;
        int j=b.length()-1;
        int flag=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0){
            int dightA= i>=0?a.charAt(i)-'0':0;
            int dightB= j>=0?b.charAt(j)-'0':0;
            int remain= dightA+dightB+flag>=2?(dightA+dightB+flag)-2:dightA+dightB+flag;
            flag= dightA+dightB+flag>=2?1:0;
            sb.append(remain);



        }

        return sb.reverse().toString();
    }

}
public class ShuShiAdd {
}
