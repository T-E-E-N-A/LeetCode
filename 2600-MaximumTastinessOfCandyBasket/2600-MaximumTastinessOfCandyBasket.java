// Last updated: 8/2/2025, 11:30:35 PM
class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int ans=0;
        int min=0,max=price[price.length-1]-price[0];
        while(min<=max){
            int mid = min + (max-min)/2;
            if(isPossible(price,k,mid)){
                ans=mid;
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] price , int k , int mid){
        int bucket=1;
        int j=price[0];
        for(int i=1 ; i<price.length ; i++){
            if(price[i]-j>=mid){
                bucket++;
                j=price[i];
            }
            if(bucket>=k){
                return true;
            }
        }
        return false;
    }
}