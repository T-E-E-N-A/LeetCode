// Last updated: 8/2/2025, 11:32:54 PM
class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0 ; i<nums.length ; i++){
            if(Math.floor(Math.log10(nums[i]))%2!=0){
                ans++;
            }
        }
        return ans;
    }
}