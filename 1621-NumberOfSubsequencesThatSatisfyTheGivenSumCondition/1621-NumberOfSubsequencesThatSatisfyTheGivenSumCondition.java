// Last updated: 8/2/2025, 11:32:21 PM
class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int[] power = new int[nums.length];
        int mod = 1000000007;
        power[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        long ans=0;
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]+nums[j]>target) j--;
            else{
                ans  = (ans+power[j-i])%mod;
                i++;
            }
        }
        // System.out.println(Integer.MAX_VALUE);
        return (int)(ans%mod);
    }
}