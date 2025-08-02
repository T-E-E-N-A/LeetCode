// Last updated: 8/2/2025, 11:33:06 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for(int i=0 ; i<candies.length ; i++){
            sum = Math.max(sum,candies[i]);
        }
        long start=0;
        long end=sum,mid=0;
        int ans=0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(isPossible(candies,k,mid)){
                ans = (int)mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] candies,long k,long mid){
        if(mid==0){
            return true;
        }
        long sum=0;
        for(int i=0 ; i<candies.length ; i++){
            sum += candies[i]/mid;
            if(sum>=k){
                return true;
            }
        }
        return false;
    }
}