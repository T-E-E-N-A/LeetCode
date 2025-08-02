// Last updated: 8/2/2025, 11:55:07 PM
class Solution {
    public int rob(int[] nums) {
        int rob=0;
        int noRob=0;
        for(int i=0; i <nums.length ; i++){
            int curr = noRob + nums[i];
            noRob = Math.max(noRob,rob);
            rob = curr;
        }
        return Math.max(noRob,rob);
    }
}