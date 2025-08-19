class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long zero=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0) zero++;
            else{
                ans += zero*(zero+1)/2;
                zero=0;
            }
        }
        ans += zero*(zero+1)/2;
        return ans;
    }
}