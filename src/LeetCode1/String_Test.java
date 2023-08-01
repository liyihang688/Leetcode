package LeetCode1;

class Solution_huiwen {
    public boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(Character.isLetterOrDigit(c1)){
                s1.append(Character.toLowerCase(c1));
            }
        }
        StringBuilder s2=new StringBuilder(s1).reverse();
        return s1.equals(s2);

    }
    public int pivotIndex(int[] nums) {
        int sum_l=0;
        int sum_r=0;
        for(int i=0;i<nums.length;i++){
            sum_r=sum_r+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sum_l==sum_r){
                return i;
            }
            else{
                sum_l+=nums[i];
                sum_r-=nums[i];
            }
        }
        return -1;

    }
}
public class String_Test {
}
