class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int start=0;
        int ans=0;
        for(int i=0 ; i<nums.length ; i++){
            while (start<=i && (nums[i]/k + (nums[i]%k==0 ? 0 : 1)) > nums[start]){
                start++;
            }
            ans = Math.max(ans,i-start+1);
        }
        return nums.length - ans;
    }
}