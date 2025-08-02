// Last updated: 8/2/2025, 11:56:18 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 2;
        for(int i=2 ; i<nums.length ; i++){
            if(nums[i]!=nums[c-2]){
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}