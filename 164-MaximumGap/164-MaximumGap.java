// Last updated: 8/2/2025, 11:55:18 PM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=0 ; i<nums.length-1 ; i++){
            max = Math.max((nums[i+1]-nums[i]),max);
        }
        return max;
    }
}