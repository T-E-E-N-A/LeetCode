// Last updated: 8/2/2025, 11:28:27 PM
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int[] copy = nums.clone();
        boolean ans1 = answer(copy,1,k);
        copy = nums.clone();
        return ans1 || answer(copy,-1,k);
    }
    public boolean answer(int[] nums, int target,int k){
        int a=0;
        for(int i=1 ; i<nums.length;i++){
            if(nums[i-1]!=target){
                nums[i-1] = target;
                nums[i] = nums[i]*-1;
                a++;
            }
            if(a>k) return false;
        }
        if(nums[nums.length-1]!=target) return false;
        return true;
    }
}