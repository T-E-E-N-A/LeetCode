// Last updated: 8/2/2025, 11:29:23 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(k>nums[0]){
            return -1;
        }
        int count=0;
        if(nums[0]>k){
            count++;
        }
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]!=nums[i-1]){
                count++;
            }
        }
        return count;
    }
}