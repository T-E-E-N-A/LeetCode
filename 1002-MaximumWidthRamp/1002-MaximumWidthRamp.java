// Last updated: 8/2/2025, 11:33:40 PM
class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        arr[n-1] = nums[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            arr[i] = Math.max(arr[i+1],nums[i]);
        }
        int left=0,right=0,max=0;
        while(right<n){
            while(right<n && arr[right]>=nums[left]){
                right++;
            }
            max = Math.max(max,right-left-1);
            left++;
            right = left+max+1;
        }
        return max;
    }
}