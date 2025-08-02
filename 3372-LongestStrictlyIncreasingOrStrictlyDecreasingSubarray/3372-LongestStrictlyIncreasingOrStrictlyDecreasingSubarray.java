// Last updated: 8/2/2025, 11:29:47 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int max=1,c=1,d=1;
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]<nums[i+1]){
                c++;
                max = Math.max(max,c);
                d=1;
            }else if(nums[i]>nums[i+1]){
                d++;
                max = Math.max(max,d);
                c=1;
            }else{
                c=1;d=1;
            }
        }
        return max;
    }
}