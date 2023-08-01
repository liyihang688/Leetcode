import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class Solution {
    public String replaceSpace(String s) {


        return s;

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< s1.length();i++){
            if(s1.charAt(i)==' '){
                sb.append("%20");
            }
            else {
                sb.append(s1.charAt(i));
            }

        }
        System.out.println(sb.toString());
    }
}