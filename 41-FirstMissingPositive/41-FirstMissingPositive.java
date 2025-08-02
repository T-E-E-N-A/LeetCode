// Last updated: 8/2/2025, 11:56:58 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        answer(nums);
        for(int i=0 ; i<nums.length ; i++){
            if(i+1 != nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void answer(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                int ind = nums[i]-1;
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
    }
}