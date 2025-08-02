// Last updated: 8/2/2025, 11:55:25 PM
class Solution {
    public int findMin(int[] nums) {
        int start=0,end = nums.length-1;
        if(nums[start]<nums[end]){
            return nums[start];
        }
        while(end>=start){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                if(start==mid){
                    return nums[start];
                }
                if(nums[start]>nums[start+1]){
                    return nums[start+1];
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return nums[end];
                }
                end--;
            }else if(nums[start]<=nums[mid]){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}