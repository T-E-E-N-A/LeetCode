// Last updated: 8/2/2025, 11:30:04 PM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long[] leftMax = new long[nums.length];
        long[] rightMax = new long[nums.length];
        long max = Long.MIN_VALUE;
        for(int i=0 ;i<nums.length ; i++){
            max = Math.max(max,nums[i]);
            leftMax[i] = max;
        }
        max = Long.MIN_VALUE;
        for(int i=nums.length-1 ;i>=0 ; i--){
            max = Math.max(max,nums[i]);
            rightMax[i] = max;
        }
        long ans=0;
        for(int i=1 ;i<nums.length-1 ; i++){
            ans = Math.max(ans,(leftMax[i-1] - nums[i])*rightMax[i+1]);
        }
        return ans;
    }
}