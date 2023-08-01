package LeetCode1;

import java.util.Scanner;
import java.util.Stack;




public class Stack_Quene1 {
    public static  void main(String[] arg){

        int[] a=new int[]{1,-2,-2,-2};
        Stack<Integer> st=new Stack<Integer>();
        for(int i :a){
            if(st.empty()==true){
                st.push(i);
                continue;
            }
            if(st.peek()<0){
                st.push(i);
                continue;
            }
            if(st.peek()>0){
                if(i>0){
                    st.push(i);
                }
                if(i<0){
                    if(Math.abs(i)<st.peek()){
                        continue;
                    }
                    if(Math.abs(i)==st.peek()){
                        st.pop();
                    }
                    if(Math.abs(i)>st.peek()){
                        while(true){
                            if(st.empty()==true){
                                st.push(i);
                                break;
                            }
                            if(Math.abs(i)>st.peek()&&st.peek()>0){
                                st.pop();
                                continue;


                            }
                            if(Math.abs(i)<st.peek()&&st.peek()>0){
                                break;
                            }
                            if(Math.abs(i)==st.peek()&&st.peek()>0){
                                st.pop();
                                break;
                            }
                            if(st.peek()<0){
                                st.push(i);
                                break;
                            }
                        }
                    }
                }

            }

        }
        int size = st.size();
        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = st.pop();
            System.out.println(ans[i]);
        }

    }


}
