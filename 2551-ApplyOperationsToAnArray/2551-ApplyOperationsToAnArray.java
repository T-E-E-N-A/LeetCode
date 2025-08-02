// Last updated: 8/2/2025, 11:30:41 PM
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]==nums[i+1]){
                nums[i] = 2*nums[i];
                nums[i+1] = 0;
            }
        }
        int i=0,k=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        while(k<nums.length){
            nums[k++]=0;
        }
        return nums;
    }
}