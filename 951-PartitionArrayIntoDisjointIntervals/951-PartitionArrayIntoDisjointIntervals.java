// Last updated: 8/2/2025, 11:33:53 PM
class Solution {
    public int partitionDisjoint(int[] nums) {
        int ans=1;
        int largest=nums[0];
        int large=nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]<largest){
                ans=i+1;
                largest = Math.max(largest,large);
            }
            large = Math.max(large,nums[i]);
        }
        return ans;
    }
}