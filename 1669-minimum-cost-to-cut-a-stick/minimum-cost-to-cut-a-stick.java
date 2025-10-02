class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int[][] dp =new int[cuts.length][cuts.length];
        return fun(cuts,0,n,0,cuts.length-1,dp);
    }
    public int fun(int[] cuts, int i, int j, int st,int end, int[][] dp){
        if(st>end) return 0;

        if(dp[st][end]!=0) return dp[st][end];

        int ans=10000000;
        for(int k=st; k<=end ; k++){
            int a = fun(cuts,i,cuts[k], st,k-1,dp);
            int b = fun(cuts,cuts[k],j, k+1,end,dp);
            ans = Math.min(ans,a+b);
        }
        ans += (j-i);
        dp[st][end] = ans;
        return ans;
    }
}