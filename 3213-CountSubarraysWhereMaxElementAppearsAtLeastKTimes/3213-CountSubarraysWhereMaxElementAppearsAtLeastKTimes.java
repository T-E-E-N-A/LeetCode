// Last updated: 8/2/2025, 11:29:56 PM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        for(int i=0 ; i<nums.length ;i++){
            max = Math.max(max,nums[i]);
        }
        long c=0,ans=0;
        int i=0,start=0;
        while(i<nums.length){
            if(nums[i]==max){
                c++;
            }
            while(c>=k){
                ans+=(nums.length-i);
                if(nums[start]==max){
                    c--;
                }
                start++;
            }
            i++;
        }
        return ans;
    }
}