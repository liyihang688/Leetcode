package LeetCode1;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist_test {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            int l, r, sum;
            Arrays.sort(nums);
            for (int i = 0; i<nums.length;i++) { //枚举第一个元素
                if (i > 0 && nums[i] == nums[i - 1]) continue; //去重，保证第一个元素只使用一轮
                l = i + 1;
                r = nums.length - 1; //确定左右指针的范围，指向i之后的区间
                while (l < r) {
                    //去重，保证第二个元素只使用一轮
                    while (l > i + 1 && l < nums.length && nums[l] == nums[l - 1]) l++;
                    if (l >= r) break; //保证左指针小于右指针
                    sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) { //找到指定三元组
                        List<Integer> ans1 = new ArrayList<Integer>();
                        ans1.add(nums[i]);
                        ans1.add(nums[l]);
                        ans1.add(nums[r]);
                        ans.add(ans1);
                        l++; //左指针右移，第一个元素固定，继续找满足条件的元素2和元素3的数对
                    } else if (sum > 0) { //三元组偏大，右指针左移
                        r--;
                    } else { //三元组偏小，左指针右移
                        l++;
                    }
                }
            }
            return ans;



        }
//    给定一个含有 n 个正整数的数组和一个正整数 target 。
//
//    找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
//
//
//
//    示例 1：
//
//    输入：target = 7, nums = [2,3,1,2,4,3]
//    输出：2
//    解释：子数组 [4,3] 是该条件下的长度最小的子数组。
//    10 9 8
//     2
        public int minSubArrayLen(int s, int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            int start = 0, end = 0;
            int sum = 0;
            while(end<n){
                sum+=nums[end];
                while(sum>=s){
                    ans= Math.min(ans,end-start+1);
                    sum-=nums[start];
                    start++;
                }
                end++;

            }
            return ans;

        }

//    给定一个正整数数组 nums和整数 k ，请找出该数组内乘积小于 k 的连续的子数组的个数。
//
//
//
//    示例 1:
//
//    输入: nums = [10,5,2,6], k = 100
//    输出: 8
//    解释: 8 个乘积小于 100 的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]。
//    需要注意的是 [10,5,2] 并不是乘积小于100的子数组。
public int numSubarrayProductLessThanK(int[] nums, int k) {
    int left = 0;
    int ret = 0;
    int total = 1;
    for (int right = 0; right < nums.length; right++) {
        total *= nums[right];
        while (left <= right && total >= k) {
            total /= nums[left++];
        }
        if (left <= right) {
            ret += right - left + 1;
        }
    }
    return ret;
}




}
