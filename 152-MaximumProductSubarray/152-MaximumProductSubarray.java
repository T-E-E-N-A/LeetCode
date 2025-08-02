// Last updated: 8/2/2025, 11:55:29 PM
class Solution {
    public int maxProduct(int[] nums) {
        int pre=0,suf=0;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0) pre=nums[i];
            else pre*=nums[i];
            if(suf==0) suf=nums[n-1-i];
            else suf*=nums[n-i-1];
            ans=Math.max(ans,Math.max(pre,suf));
        }
        return ans;
    }
}