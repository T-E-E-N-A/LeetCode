// Last updated: 8/2/2025, 11:29:09 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum2=0;
        for(int i=0 ; i<nums.length ; i++){
            sum2 += nums[i];
        }
        int count=0,sum1=0;
        for(int j=0 ; j<nums.length-1 ; j++){
            sum1 += nums[j];
            sum2 -= nums[j];
            if((sum2-sum1)%2==0){
                count++;
            }
        }
        return count;
    }
}