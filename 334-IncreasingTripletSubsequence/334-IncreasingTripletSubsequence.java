// Last updated: 8/2/2025, 11:35:55 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(a>=nums[i]){
                a = nums[i];
            }else if(nums[i]<=b){
                b = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}