// Last updated: 8/2/2025, 11:33:37 PM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        long sum=0;
        arr[0]=1;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int rem = (int)(sum%k);
            if(rem<0)rem = k+rem;
            arr[rem%k]++;
        }
        int ans=0;
        for(int i=0 ; i<arr.length ; i++){
            ans += ((long)arr[i]*(arr[i]-1))/2;
        }
        return ans;
    }
}