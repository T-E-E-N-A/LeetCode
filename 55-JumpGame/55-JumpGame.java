// Last updated: 8/2/2025, 11:56:40 PM
class Solution {
    public boolean canJump(int[] nums) {
        int aim=nums.length-1;
        for(int i=nums.length-2 ; i>=0 ; i--){
            if(i+nums[i]>=aim){
                aim = i;
            }
        }
        return aim==0;
    }
}