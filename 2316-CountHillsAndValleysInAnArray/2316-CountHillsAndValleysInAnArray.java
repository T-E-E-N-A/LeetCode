// Last updated: 8/2/2025, 11:31:09 PM
class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        for(int i=1 ; i<nums.length-1 ; i++){
            int j=i-1;
            if(nums[i]==nums[j]) continue;
            int k=j+1;
            while(k<nums.length && nums[k]==nums[i]){
                k++;
            }
            if(j<0 || k>=nums.length) continue;
            if(nums[i]>nums[j] && nums[i]>nums[k]) c++;
            else if(nums[i]<nums[j] && nums[i]<nums[k]) c++;
        }
        return c;
    }
}