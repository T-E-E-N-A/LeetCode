// Last updated: 8/2/2025, 11:31:47 PM
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int max=1000000000;
        // for(int i=0 ;i<dist.length ; i++){
        //     max = Math.max(max,dist[i]);
        // }
        int min=0,ans=-1;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(isPossible(dist,hour,mid)){
                ans = mid;
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] dist,double hour,int mid){
        double check=0;
        for(int i=0 ;i<dist.length ; i++){
            check += dist[i]*1.0/mid;
            if(i!=dist.length-1){
                check = Math.ceil(check);
            }
            if(check>hour){
                return false;
            }
        }
        return true;
    }
}