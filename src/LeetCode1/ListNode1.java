package LeetCode1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public boolean isStraight(int[] nums) {
        int flag=0;
        int[] num1=new int[5];
        Arrays.sort(nums);
        for(int i=0;i<4;i++){
            if(nums[i]==0){
                flag++;
            }
            else if(nums[i]==nums[i+1]){
                return false;
            }
        }
        return nums[4]-nums[flag-1]<5;
    }
}
class ListNode {
     int val;
      ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public int[] reversePrint(ListNode head) {
        int[]  l1=new int[10000] ;
        int i=0;
        while(true){
            if (head==null) break;
            l1[i] = head.val;
            i++;
            head=head.next;
        }

return  l1;
    }



}
public class ListNode1 {
}
