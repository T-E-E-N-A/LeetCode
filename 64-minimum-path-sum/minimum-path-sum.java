class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] dpin : dp) Arrays.fill(dpin,100000);
        return fun(grid,0,0,dp);
    }
    public int fun(int[][] grid,int i,int j,int[][] dp){
        if(j==grid[0].length-1 && i==grid.length-1) return grid[i][j];
        if(j>=grid[0].length || j<0 || i<0 || i>=grid.length) return Integer.MAX_VALUE;
        
        if(dp[i][j]!=100000) return dp[i][j];

        int a = Math.min(dp[i][j] , fun(grid,i+1,j,dp));
        a = Math.min(a,fun(grid,i,j+1,dp));
        return dp[i][j] = a + grid[i][j];
    }
}