// Last updated: 8/2/2025, 11:56:55 PM
class Solution {
    public int jump(int[] nums) {
        int[] count = new int[nums.length];
        count[nums.length-1]=0;
        for(int i=nums.length-2 ; i>=0 ; i--){
            int j=Math.min(nums.length-1,nums[i]+i);
            int min = Integer.MAX_VALUE-1;
            for(;j>i;j--){
                min = Math.min(min,count[j]);
            }
            count[i] = min+1;
        }
        return count[0];
    }
}