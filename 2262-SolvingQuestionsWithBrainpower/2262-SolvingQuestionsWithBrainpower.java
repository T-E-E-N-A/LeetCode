// Last updated: 8/2/2025, 11:31:17 PM
class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] arr = new long[n];
        for(int i=n-1 ; i>=0 ; i--){
            long a = questions[i][0];
            arr[i] = a;
            if((i + 1 + questions[i][1])<n){
                arr[i] = arr[i]+ arr[i + 1 + questions[i][1]];
            }
            if(i+1<n){
                arr[i] = Math.max(arr[i],arr[i+1]);
            }
        }
        return arr[0];
    }
}