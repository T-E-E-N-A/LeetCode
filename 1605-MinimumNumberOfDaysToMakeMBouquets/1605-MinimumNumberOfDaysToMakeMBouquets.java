// Last updated: 8/2/2025, 11:32:26 PM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length){
            return -1;
        }
        int min=0;
        int max=bloomDay[0];
        for(int i=1 ; i<bloomDay.length ; i++){
            max = Math.max(max,bloomDay[i]);
        }
        int ans=-1;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(isPossible(bloomDay,mid,m,k)){
                System.out.println(mid);
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] bloomDay,int mid,int m,int k){
        int bouquet=0,flower=0;
        for(int i=0 ; i<bloomDay.length ; i++){
            if(bloomDay[i]<=mid){
                flower++;
            }else{
                flower=0;
            }
            if(flower==k){
                flower=0;
                bouquet++;
            }
            if(bouquet>=m){
                return true;
            }
        }
        return false;
    }
}