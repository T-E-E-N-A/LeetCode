class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i=1 ; i<=word1.length() ; i++){
            for(int j=1 ; j<=word2.length() ; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int lcs = dp[word1.length()][word2.length()];
        return word1.length() + word2.length() - 2*lcs;
    }
    // public int fun(String word1,String word2,int i,int j){
    //     if(i==word1.length() && j==word2.length()) return 0;

    //     if(word1.length()==i) return word2.length()-j;
    //     if(word2.length()==j) return word1.length()-i;

    //     if(dp[i][j]!=-1) return dp[i][j];

    //     if(word1.charAt(i)==word2.charAt(j)){
    //         return dp[i][j] = fun(word1,word2,i+1,j+1);
    //     }
    //     return dp[i][j] = Math.min(fun(word1,word2,i+1,j),fun(word1,word2,i,j+1))+1;
    // }
}