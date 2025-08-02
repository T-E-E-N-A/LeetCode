// Last updated: 8/2/2025, 11:32:28 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int start=0,end=0;
        int ans=0,k=0;
        while(end<nums.length){
            if(nums[end]==0){
                // shrink
                if(k==1){
                    while(nums[start++]!=0);
                }
                // usable for first time only as k=0 initially
                k=1;
            }
            ans = Math.max(ans,end-start);
            // window is growing
            end++;
        }
        return ans;
    }
}