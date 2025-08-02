// Last updated: 8/2/2025, 11:29:53 PM
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int idx=0;
        int[][] ans = new int[n/3][3];
        for(int i=2; i<n ;i+=3){
            if(nums[i]-nums[i-2]>k)
                return new int[0][0];
            ans[idx][0]=nums[i-2];
            ans[idx][1]=nums[i];
            ans[idx++][2]=nums[i-1];
        }
        return ans;
    }
}