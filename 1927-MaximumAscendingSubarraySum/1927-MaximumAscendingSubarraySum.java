// Last updated: 8/2/2025, 11:31:53 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]<nums[i+1]){
                sum += nums[i+1];
            }else{
                max = Math.max(max,sum);
                sum = nums[i+1];
            }
        }
        max = Math.max(max,sum);
        return max;
    }
}