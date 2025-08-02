// Last updated: 8/2/2025, 11:30:51 PM
class Solution {
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            arr[i] = sumDigit(nums[i]);
        }
        int ans=-1;
        int ind = 0;
        for(int i=nums.length-1 ; i>=0 ; i--){
            for(int j=i-1;j>=ind; j--){
                if(arr[i]==arr[j]){
                    ind=j;
                    ans = Math.max(ans,nums[i]+nums[j]);
                    break;
                }
            }
        }
        return ans;
    }
    public int sumDigit(int n){
        int ans=0;
        while(n>0){
            ans += n%10;
            n/=10;
        }
        return ans;
    }
}