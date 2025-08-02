// Last updated: 8/2/2025, 11:34:02 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=0,max=piles[0];
        for(int i=0 ; i<piles.length ; i++){
            max = Math.max(max,piles[i]);
        }
        while(min<max){
            int mid = min + (max-min)/2;
            if(isPossible(mid,piles,h)){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return max;
    }
    public boolean isPossible(int mid , int[] piles , int hour){
        int ans=0;
        if(mid==0){
            return false;
        }
        for(int i=0 ; i<piles.length ;i++){
            ans += (piles[i]/mid +1);
            if(piles[i]%mid==0){
                ans--;
            }
            if(ans>hour){
                return false;
            }
        }
        if(ans<=hour){
            return true;
        }
        return false;
    }
}