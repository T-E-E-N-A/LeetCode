// with O(n) - space complexity (possible only in bottom-up approach)
// with O(n^2) - time complexity 
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        // let's fill base case
        // last line in dp as from that we will pick minimum i.e. whether i or i+1
        for(int i=0 ; i<n ; i++){
            dp[i] = triangle.get(n-1).get(i);
        }

        // why n-2 as n-1 is already filled
        for(int i=n-2 ; i>=0 ; i--){
            for(int j=0 ; j<=i ; j++){
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j],dp[j+1]);
            }
        }
        return dp[0];
    }
}



// with O(n^2) - space complexity 
// with O(n^2) - time complexity 

// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int[][] dp = new int[triangle.size()][triangle.size()];
//         for(int[] dpin : dp) Arrays.fill(dpin,10000000);
//         return fun(triangle,0,0,dp);
//     }
//     public int fun(List<List<Integer>> triangle, int i, int j, int[][] dp){
//         if(i>=triangle.size()) return 0;
//         if(triangle.get(i).size()==j) return Integer.MAX_VALUE; 

//         if(dp[i][j]!=10000000) return dp[i][j];

//         int a = fun(triangle, i+1, j, dp);
//         int b = fun(triangle, i+1, j+1, dp);
//         return dp[i][j] = Math.min(a,b)+triangle.get(i).get(j);
//     }
// }