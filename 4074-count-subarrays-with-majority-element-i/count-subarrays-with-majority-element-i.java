class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        int ans=0;
        for(int i=0 ; i<nums.length ; i++){
            count=0;
            for(int j=i ; j<nums.length ; j++){
                if(nums[j]==target) count++;
                if(count>(j-i+1)/2) ans++;
            }
        }
        return ans;
    }
}