package LeetCode1;

class Solution_DP1 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=cost.length;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length+1];
    }
    //循环偷房子，选取0-n-2或1-n-1
        public int rob(int[] nums) {
            int length = nums.length;
            if (length == 1) {
                return nums[0];
            } else if (length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
        }

        public int robRange(int[] nums, int start, int end) {
        int[] dp=new int[end];
        dp[start]=nums[start];
        dp[start+1] = Math.max(nums[start], nums[start + 1]);
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
         return dp[end];
        }
//xiugai
//dfs上下左右搜索周围是否为1
        public int maxAreaOfIsland(int[][] grid) {//深搜岛屿最大的面积
        int ans=0;
        for(int i = 0; i <grid.length; i++){
            for (int j = 0; j <grid[0].length; j++) {
                ans = Math.max(ans, dfs_maxAreaOfIsland(grid, i, j));
            }
        }
            return ans;
        }

        public int dfs_maxAreaOfIsland(int[][] grid, int cur_i, int cur_j) {//深搜岛屿最大的面积
            if (cur_i < 0 || cur_j < 0 || cur_i == grid.length || cur_j == grid[0].length || grid[cur_i][cur_j]==0) {
                return 0;
            }
            grid[cur_i][cur_j] = 0;
            int[] di = {0, 0, 1, -1};
            int[] dj = {1, -1, 0, 0};
            int ans = 1;
            for (int index = 0; index < 4; index++) {
                int next_i = cur_i + di[index], next_j = cur_j + dj[index];
                ans += dfs_maxAreaOfIsland(grid, next_i, next_j);
            }
            return ans;
        }

//dp动态规划【0-1背包问题】
    //分割等和子集题目
    //dp[i][j]表示前i个数中抽取的数字和为j的状态是否为True
//    考虑边界情况：
//    当i==0时：dp[0][nums[0]]=True
//    当j==0时：dp[i][0]=True
//    当i>0||j>0 时候，分情况
//    j>=nums[i]
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][target];
    }




}
public class DP_1 {
}
