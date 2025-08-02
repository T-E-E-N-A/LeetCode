// Last updated: 8/2/2025, 11:31:38 PM
class Solution {
    public int maximumDifference(int[] nums) {
        int n  = nums.length;
        int min = nums[0];
        int ans = -1;
        for(int i=1 ; i<n ; i++){
            if(nums[i]>min)
                ans = Math.max(nums[i]-min,ans);
            min = Math.min(min,nums[i]);
        }
        return ans;
    }
}