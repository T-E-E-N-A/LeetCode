// Last updated: 8/2/2025, 11:35:21 PM
class Solution {
    public int arrangeCoins(int n) {
    long start = 1;
    long end = n;
    long ans = 0;
    long mid = 0;
    
    while(start <= end) {
        mid = start + (end-start)/2;
        
        long coinCount = (mid*(mid+1))/2;
            
            if(coinCount <= n){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
    }
    return (int)ans;
    }
}