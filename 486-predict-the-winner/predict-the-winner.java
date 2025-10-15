class Solution {
    int alex=0,bob=0;
    public boolean predictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for(int[] dpn : dp) Arrays.fill(dpn,-1);
        int total=0;
        for(int i : nums) total += i;
        int x = fun(nums,0,nums.length-1,dp);
        return x>=total-x;
    }
    public int fun(int[] nums,int i, int j,int[][] dp){
        if(i>j){
            return 0;
        }

        if(dp[i][j]!=-1) return dp[i][j];

        int a = Math.min(fun(nums,i+2,j,dp),fun(nums,i+1,j-1,dp)) + nums[i];
        int b = Math.min(fun(nums,i,j-2,dp),fun(nums,i+1,j-1,dp)) + nums[j];
        return dp[i][j] = Math.max(a,b);
    }
}