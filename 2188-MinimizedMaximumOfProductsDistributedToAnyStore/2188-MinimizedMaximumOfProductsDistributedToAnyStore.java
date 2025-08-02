// Last updated: 8/2/2025, 11:31:30 PM
class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int min=1,max = quantities[0];
        for(int i=0 ; i<quantities.length ; i++){
            max = Math.max(max,quantities[i]);
        }
        int ans=-1;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(isPossible(quantities,n,mid)){
                ans=mid;
                max=mid-1;
            }else{
                min= mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] quantities , int n , int mid){
        if(mid==0){
            return false;
        }
        int bouquet=0;
        for(int i=0 ; i<quantities.length ; i++){
            bouquet+=(quantities[i])/mid +1;
            if(quantities[i]%mid==0) bouquet--;
            if(bouquet>n){
                return false;
            }
        }
        return true;
    }
}