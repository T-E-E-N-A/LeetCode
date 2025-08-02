// Last updated: 8/2/2025, 11:31:44 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}