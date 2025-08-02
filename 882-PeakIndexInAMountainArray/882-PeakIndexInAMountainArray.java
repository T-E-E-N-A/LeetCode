// Last updated: 8/2/2025, 11:34:08 PM
class Solution {
    public int peakIndexInMountainArray(int[] nums) {
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