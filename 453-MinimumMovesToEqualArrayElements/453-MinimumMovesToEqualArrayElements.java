// Last updated: 8/2/2025, 11:35:11 PM
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int c=nums[nums.length-1]-nums[0];
        for(int i=nums.length-2 ; i>=0 ;i--){
            int temp=max;
            max = Math.max(max,nums[i]+c);
            c += max-temp;
        }
        return c;
    }
}