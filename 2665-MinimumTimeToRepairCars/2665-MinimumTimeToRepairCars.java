// Last updated: 8/2/2025, 11:30:24 PM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long start=1;
        long end = (long)ranks[0] * cars * cars;
        long ans=end;
        while(start<=end){
            long mid = start + (end- start)/2;
            if(isPossible(ranks,cars,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] ranks,int cars , long mid){
        long ans=0;
        for(int i=0 ; i<ranks.length ; i++){
            // ranks[i]*can*can > mid
            // can*can >= mid/ranks[i]
            ans += Math.sqrt(mid/ranks[i]);
            if(ans>=cars){
                return true;
            }
        }
        return false;
    }
}