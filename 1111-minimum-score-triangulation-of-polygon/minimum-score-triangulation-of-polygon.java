class Solution {
    // Time complexity : O(n^3)
    // Space complexity : O(n^2)
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        for(int[] dpin : dp) Arrays.fill(dpin,-1);
        return fun(values,0,n-1, dp);
    }
    public int fun(int[] values,int i,int j, int[][] dp){
        if(j-i <= 1) return 0;
        if(j-i==2) return values[i]*values[j]*values[j-1];

        if(dp[i][j]!=-1) return dp[i][j];
 
        // dividing it into 2parts
        int ans=Integer.MAX_VALUE;
        for(int k=i+1; k<j ; k++){
            ans = Math.min((values[i]*values[j]*values[k] + fun(values,i,k,dp) + fun(values,k,j,dp)),ans);
        }
        return dp[i][j] = ans;
    }
}