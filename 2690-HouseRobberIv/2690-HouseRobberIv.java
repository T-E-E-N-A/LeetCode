// Last updated: 8/2/2025, 11:30:21 PM
class Solution {
    public int minCapability(int[] nums, int k) {
        int start = Integer.MAX_VALUE,end=Integer.MIN_VALUE;
        for(int i=0;i<nums.length ;i++){
            if(start>nums[i]){
                start = nums[i];
            }
            if(end<nums[i]){
                end = nums[i];
            }
        }
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(nums,k,mid)){
                ans = mid;
                end = mid-1;//decreasing on founding answer as we want min of max that answer should be minimum
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] nums,int k,int mid){
        int count=0;//to check atleast k
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]<=mid){//why only less bcs we want max of min so we get max as mid value if number is smaller than mid no issue as max is mid
                count++;
                i++;
            }
        }
        return count>=k;
    }
}