// Last updated: 8/2/2025, 11:30:57 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long zero=0,ans=0;
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==0){
                zero++;
                // why this bcs no. of subarrays = sum of number of terms
                // subarray from n terms = n*(n+1)/2
                ans += zero;
            }else{
                zero=0;
            }
        }
        return ans;
    }
}