class Solution {
    int cnt=0;
    static int mod=1000000007;
    public int numberOfPaths(int[][] grid, int k) {
        int[][][] dp = new int[grid.length][grid[0].length][k];
        for(int[][] dpi : dp) 
            for(int[] dpin : dpi) 
                Arrays.fill(dpin,-1);
        return (fun(grid,k,0,0,0,dp)+mod)%mod;
    }
    public int fun(int[][] grid,int k,int i,int j, int ans,int[][][] dp){
        if(i>=grid.length || j>=grid[0].length) return 0;

        if(i==grid.length-1 && j==grid[0].length-1){
            if((ans+grid[i][j])%k==0) return 1;
            return 0;
        }
        ans = (ans+grid[i][j])%k;

        if(dp[i][j][ans]!=-1) return dp[i][j][ans];

        dp[i][j][ans] = fun(grid,k,i+1,j,ans,dp)%mod;
        dp[i][j][ans] += fun(grid,k,i,j+1,ans,dp)%mod;

        return (dp[i][j][ans]%mod+mod)%mod;
    }
}