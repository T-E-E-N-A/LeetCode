// Last updated: 8/2/2025, 11:35:29 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int min=0 , max=0;
        for(int i=0 ; i<nums.length ; i++){
            max += nums[i];
        }
        while(min<max){
            int mid = min + (max-min)/2;
            if(isPossible(nums,k,mid)){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return max;
    }
    public boolean isPossible(int[] nums, int k , int mid){
        int sum=0,split=0;
        int i=0;
        while(i<nums.length){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
                i++;
            }else{
                sum=0;
                split++;
            }
            if(split==k){
                return false;
            }
        }
        return true;
    }
}