// Last updated: 8/2/2025, 11:36:28 PM
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int rob=0,norob=0;
        int curr=0;
        for(int i : nums){
            curr = i + norob;
            norob = Math.max(norob,rob);
            rob = curr;
        }
        if(norob == Math.max(norob,rob)) return norob;
        int r=0,nr=0;
        for(int i=1 ;i<nums.length ; i++){
            curr = nums[i] + nr;
            nr = Math.max(nr,r);
            r = curr;
        }
        nr = Math.max(nr,r);
        return Math.max(norob,nr);
    }
}