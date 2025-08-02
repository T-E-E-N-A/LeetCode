// Last updated: 8/2/2025, 11:29:20 PM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] arr = new int[n+1];
        int sum=0;
        for(int i=0 ; i<queries.length ; i++){
            arr[queries[i][0]]++;
            arr[queries[i][1]+1]--;
        }
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
            if(sum<nums[i]){
                return false;
            }
        }
        return true;
    }
}
