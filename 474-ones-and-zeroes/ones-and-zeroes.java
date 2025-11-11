class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int c=0;
        int[][][] dp = new int[strs.length][m+1][n+1];
        for(int[][] dpi : dp) for(int[] dpin:dpi) Arrays.fill(dpin,-1);
        return fun(strs,0,m,n,dp);
    }
    public int fun(String[] strs,int i, int m, int n,int[][][] dp){
        if(n<0 || m<0) return 0;
        if(n==0 && m==0) return 0;
        if(i==strs.length) return 0;

        if(dp[i][m][n]!=-1) return dp[i][m][n];

        int max = fun(strs,i+1,m,n,dp);
        int a = count(strs[i],'0');
        int b = strs[i].length()-a;
        if(m-a>=0 && n-b>=0) max = Math.max(max,fun(strs,i+1,m-a,n-b,dp)+1);
        return dp[i][m][n] = max;
    }
    public int count(String s, char ch){
        int ans=0;
        for(int i=0;i<s.length() ; i++){
            if(s.charAt(i)==ch) ans++;
        }
        return ans;
    }
}