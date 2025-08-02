// Last updated: 8/2/2025, 11:33:28 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,min=weights[0];
        for(int i=0 ; i<weights.length ; i++){
            max += weights[i];
            min = Math.max(min,weights[i]);
        }
        while(min<max){
            int mid = min + (max-min)/2;
            if(isPossible(mid,weights,days)){
                System.out.println(mid);
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return max;
    }
    public boolean isPossible(int mid,int[] weights , int days){
        int num=0,count=1;
        for(int ele : weights){
            if(num+ ele >mid){
                num=0;
                count++;
            }
            num+= ele;
            if(count>days){
                return false;
            }
        }
        return true;
    }
}