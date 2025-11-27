class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long max=0;
        // subarray sum % k==0 
        // m1 -> HashMap
        // m2 -> Prefix sum Array
        long[] pre = new long[nums.length+1];
        for(int i=0 ; i<nums.length ; i++){
            max += nums[i]; 
            pre[i+1]=max;
        }
        long[] ans = new long[k];   // storing minimum in ans
        Arrays.fill(ans,Integer.MAX_VALUE);

        max = Long.MIN_VALUE;   //that index i.e. total sum-previous minimum sum subarray

        for(int i=0 ; i<=nums.length ; i++){
            if(i>=k){
                max = Math.max(max,pre[i]-ans[i%k]);
            }
            ans[i%k] = Math.min(ans[i%k],pre[i]);
        }
        return max;
    }
}