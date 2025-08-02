// Last updated: 8/2/2025, 11:34:45 PM
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int ans=0,start=0;
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==1+nums[start]){
                ans = Math.max(ans,i-start+1);
            }else if(nums[i]>nums[start]+1){
                start++;
                i--;
            }
        }
        return ans;
    }
}