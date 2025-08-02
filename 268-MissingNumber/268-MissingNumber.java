// Last updated: 8/2/2025, 11:36:10 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum=0;
        for(int i=0 ; i<n ; i++){
            sum+=nums[i];
        }
        long summ = n*(n+1)/2;
        return (int)(summ-sum);
    }
}