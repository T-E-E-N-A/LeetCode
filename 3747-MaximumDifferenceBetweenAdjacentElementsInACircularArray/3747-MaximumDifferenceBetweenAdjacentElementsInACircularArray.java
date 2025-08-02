// Last updated: 8/2/2025, 11:28:55 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=0;
        for(int i=0 ; i<nums.length-1 ; i++){
            ans = Math.max(Math.abs(nums[i]-nums[i+1]),ans);
        }
        ans = Math.max(Math.abs(nums[0]-nums[nums.length-1]),ans);
        return ans;
    }
}