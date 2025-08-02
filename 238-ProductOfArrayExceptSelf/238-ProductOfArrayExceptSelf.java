// Last updated: 8/2/2025, 11:36:15 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] left = new int[n];
        int [] right = new int[n];
        left[0] = 1;
        for(int i=1;i<n ; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        right[n-1] = 1;
        for(int i=n-2;i>=0 ; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        int [] pro = new int[n];
        for(int i=0 ; i<n ;i++){
            pro[i] = left[i]*right[i];
        }
        return pro;
    }
}