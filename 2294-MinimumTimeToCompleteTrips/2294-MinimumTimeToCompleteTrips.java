// Last updated: 8/2/2025, 11:31:11 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min=Long.MAX_VALUE;
        long max = Long.MAX_VALUE;
        for(int i: time){
            min = Math.min(min,i);
        }
        max = min*totalTrips;
        while(min<max){
            long mid = min + (max-min)/2;
            if(isPossible(mid ,time , totalTrips)){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
    public boolean isPossible(long mid , int[] time , int totalTrips){
        long count=0;
        for(int i : time){
            count += (mid)/i;
        }
        if(count>=totalTrips){
            return true;
        }
        return false;
    }
}