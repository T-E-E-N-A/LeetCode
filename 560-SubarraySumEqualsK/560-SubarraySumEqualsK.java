// Last updated: 8/2/2025, 11:34:51 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        for(int i=0 ; i<nums.length ; i++){
            sum = 0;
            for(int j=i ; j<nums.length ; j++){
                sum += nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}