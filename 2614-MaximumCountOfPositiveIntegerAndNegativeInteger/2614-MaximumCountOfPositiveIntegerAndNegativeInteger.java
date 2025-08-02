// Last updated: 8/2/2025, 11:30:32 PM
class Solution {
    public int maximumCount(int[] nums) {
        int s=0,p=0;
        for(int i=0;i<nums.length ; i++){
            if(nums[i]>0){
                p++;
            }else if(nums[i]<0){
                s++;
            }
        }
        return Math.max(s,p);
    }
}
