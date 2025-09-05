class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length+1];
        Arrays.fill(dp[0],1);
        for(int i=1 ; i<dp.length ; i++){
            for(int j=1 ; j<dp[0].length ; j++){
                int a = 0;
                if(i >= coins[j-1]){
                    a = dp[i-coins[j-1]][j]; 
                } 
                dp[i][j] = a + dp[i][j-1];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    /*
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount][coins.length];
        for(int[] dpi : dp){
            Arrays.fill(dpi,-1);
        }
        return fun(amount,coins,0,0,dp);
    }
    public int fun(int amount,int[] coins,int i,int j, int[][] dp){
        if(i==amount) return 1;
        if(j==coins.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(i+coins[j]<=amount){
            ans =  fun(amount,coins,i+coins[j],j,dp);
        }
        ans += fun(amount,coins,i,j+1,dp);
        dp[i][j] = ans;
        return ans;
    }*/
}