// Last updated: 8/2/2025, 11:28:38 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        long sum=0;
        for(int i=0 ;i<nums.length ; i++){
            sum += nums[i];
        }
        return (int)(sum%k);
    }
}