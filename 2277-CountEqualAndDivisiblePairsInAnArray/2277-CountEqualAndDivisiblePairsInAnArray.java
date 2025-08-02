// Last updated: 8/2/2025, 11:31:14 PM
class Solution {
    public int countPairs(int[] nums, int k) {
        int ans=0;
        for(int i=0 ;  i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    ans++;
                }
            }
        }
        return ans;
    }
}