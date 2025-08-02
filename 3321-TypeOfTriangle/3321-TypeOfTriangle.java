// Last updated: 8/2/2025, 11:29:50 PM
class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[0]+nums[2]<=nums[1]){
            return "none";
        }
        if(nums[0]==nums[1] && nums[0]==nums[2]){
            return "equilateral";
        }else if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]){
            return "isosceles";
        }

            return "scalene";
    }
}