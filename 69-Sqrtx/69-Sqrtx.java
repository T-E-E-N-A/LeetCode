// Last updated: 8/2/2025, 11:56:30 PM
class Solution {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int start=1,end = x;
        int mid=start + (end-start)/2;
        while(start<=end){
            if((long)mid*mid<(long)x){
                start = mid+1;
            }else if((long)mid*mid>(long)x){
                end = mid-1;
            }else{
                return mid;
            }
            mid=start + (end-start)/2;
        }
        return end;
    }
}