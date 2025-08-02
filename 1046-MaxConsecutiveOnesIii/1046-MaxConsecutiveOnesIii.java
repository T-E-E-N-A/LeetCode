// Last updated: 8/2/2025, 11:33:30 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0,start=0,end=0;
        while(end<nums.length){
            if(nums[end]==0){
                if(k<=0){
                    // window shrink
                    while(nums[start++]!=0){
                    }
                    k++;
                }
                k--;
            }
            // calculating max size
            ans = Math.max(ans,end-start+1);
            // growng window
            end++;
        }
            return ans;
    }
}