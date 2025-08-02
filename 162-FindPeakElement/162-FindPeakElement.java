// Last updated: 8/2/2025, 11:55:20 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int start=0,end=nums.length-1;
        if(nums.length==1){
            return 0;
        }
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
}