// Last updated: 8/2/2025, 11:28:36 PM
class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long pro=1;
        for(int i=0 ; i<nums.length ; i++){
            pro *= nums[i];
            if(nums[i]>target) return false;
        }
        return pro==target*target;
    }
}