// Last updated: 8/2/2025, 11:55:00 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int st=0;
        while(i<nums.length){
            sum += nums[i];
            if(sum>=target){
                while(!(sum-nums[st]<target) && st<i){
                    sum -= nums[st++];
                }
                ans = Math.min(ans,i-st+1);
            }
            i++;
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}