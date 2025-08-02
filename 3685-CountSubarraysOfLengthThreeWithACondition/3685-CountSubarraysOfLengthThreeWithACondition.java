// Last updated: 8/2/2025, 11:29:11 PM
class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=2 ; i<nums.length ; i++){
            if(nums[i]+nums[i-2]*1.0==nums[i-1]*1.0/2){
                count++;
            }
        }
        return count;
    }
}