// Last updated: 8/2/2025, 11:32:04 PM
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0 ; i<nums.length-1  ; i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            c++;
        }
        if(c<=1){
            return true;
        }
        return false;
    }
}