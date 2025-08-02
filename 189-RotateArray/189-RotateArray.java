// Last updated: 8/2/2025, 11:55:09 PM
class Solution {
    public void rotate(int[] nums, int k) {
        rev(nums,0,nums.length);
        rev(nums,0,k%nums.length);
        rev(nums,k%nums.length,nums.length);
    }
    public static void rev(int[] nums,int i,int k){
        while(i<k){
            int temp=nums[k-1];
            nums[k-1]=nums[i];
            nums[i]=temp;
            i++;
            k--;
        }
    }
}