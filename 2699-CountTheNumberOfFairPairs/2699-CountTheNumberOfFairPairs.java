// Last updated: 8/2/2025, 11:30:19 PM
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long max = answer(nums,lower);
        long min = answer(nums,upper+1);
        return max-min;
    }
    public long answer(int[] nums,int lower){
        // lower se upr vaale saare btayenge
        int start=0;
        int end = nums.length-1;
        long ans=0;
        while(start<end){
            if(nums[start]+nums[end]<lower){
                start++;
            }else{
                ans += end-start;
                end--;
            }
        }
        return ans;
    }
}