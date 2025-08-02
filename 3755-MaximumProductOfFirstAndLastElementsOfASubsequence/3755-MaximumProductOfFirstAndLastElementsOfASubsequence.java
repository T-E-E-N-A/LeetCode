// Last updated: 8/2/2025, 11:28:51 PM
class Solution {
    public long maximumProduct(int[] nums, int m) {
        int n = nums.length;
        int[] MAX = new int[n];
        int[] MINI = new int[n];
        MAX[n-1]=MINI[n-1]=nums[n-1];
        for(int i=nums.length-2 ; i>=0 ; i--){
            MAX[i] = Math.max(nums[i],MAX[i+1]);
            MINI[i] = Math.min(nums[i],MINI[i+1]);
        }
        long ans= Long.MIN_VALUE;
        for(int i=0 ; i<nums.length-m+1 ; i++){
            if(i+m-1<nums.length){
                ans = Math.max((long)nums[i]*MAX[i+m-1],ans);
                ans = Math.max((long)nums[i]*MINI[i+m-1],ans);
            }
        }
        return ans;
    }
}