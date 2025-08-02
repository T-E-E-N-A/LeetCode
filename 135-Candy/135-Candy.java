// Last updated: 8/2/2025, 11:55:45 PM
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] ans = new int[n];
        for(int i=1; i<n ; i++){
            if(ratings[i]>ratings[i-1]){
                ans[i] = ans[i-1]+1;
            }
        }
        int sum=0;
        for(int i=n-2 ; i>=0 ; i--){
            if(ratings[i]>ratings[i+1]){
                ans[i] = Math.max(ans[i],ans[i+1]+1);
            }
                sum += ans[i];
        }
        sum += ans[n-1];
        return sum+n;
    }
}