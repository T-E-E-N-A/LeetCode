// Last updated: 8/2/2025, 11:56:24 PM
class Solution {
    public void sortColors(int[] nums) {
        int end = nums.length -1 , start=0;
        for(int i=0 ; i<=end ; i++){
            if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[end];
                nums[end] = temp;
                end--;
                i--;
            }else if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start] = temp;
                start++;
            }
        }
    }
}