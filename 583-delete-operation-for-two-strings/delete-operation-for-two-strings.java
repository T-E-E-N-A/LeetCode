class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int[] dpin:dp) Arrays.fill(dpin,-1);
        return fun(word1,word2,0,0);
    }
    public int fun(String word1,String word2,int i,int j){
        if(i==word1.length() && j==word2.length()) return 0;

        if(word1.length()==i) return word2.length()-j;
        if(word2.length()==j) return word1.length()-i;

        if(dp[i][j]!=-1) return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j] = fun(word1,word2,i+1,j+1);
        }
        return dp[i][j] = Math.min(fun(word1,word2,i+1,j),fun(word1,word2,i,j+1))+1;
    }
}