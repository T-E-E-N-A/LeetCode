// Last updated: 8/2/2025, 11:32:56 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min=1,max=nums[0];
        for(int i=0 ; i<nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        while(min<max){
            int mid = min + (max-min)/2;
            if(isPossible(nums,mid,threshold)){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return max;
    }
    public boolean isPossible(int[] nums ,  int mid , int threshold){
        int sum=0;
        for(int i=0 ; i<nums.length ; i++){
            sum += (nums[i]/mid + 1);
            if(nums[i]%mid==0){
                sum-=1;
            }
            if(sum>threshold){
                return false;
            }
        }
        return true;
    }
}