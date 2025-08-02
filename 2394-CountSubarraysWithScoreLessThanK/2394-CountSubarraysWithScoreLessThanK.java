// Last updated: 8/2/2025, 11:31:00 PM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans=0;
        int i=0,start=0;
        long sum=0,score=0;
        int len=0;
        while(i<nums.length){
            // increment
            sum += nums[i];
            len++;
            score = sum*len;


            // window decrement
            while(k<=score){
                sum -= nums[start++];
                len--;
                score = sum*len;
            }
            // ans update
            if(score<k){
                ans += (i-start+1);
            }
            i++;
        }
        return ans;
    }
}