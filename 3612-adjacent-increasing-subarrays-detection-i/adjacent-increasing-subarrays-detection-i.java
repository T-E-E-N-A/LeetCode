class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int a=0,b=k;
        int ans=1;
        while(b<nums.size()-1){
            // window check
            if(nums.get(a+1)>nums.get(a) && nums.get(b+1)>nums.get(b)){
                ans++;
            }else{
                ans=1;
            }
            if(ans>=k) return true;

            a++;
            b++;
        }
        return ans>=k;
    }
}