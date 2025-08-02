// Last updated: 8/2/2025, 11:28:57 PM
class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=0;
        int trace=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>=nums[trace]){
                trace =i;
                count++;
            }
        }
        return count;
    }
}