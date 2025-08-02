// Last updated: 8/2/2025, 11:35:47 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int end = num , start=0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if((long)mid*mid==(long)num){
                return true;
            }else if((long)mid*mid>(long)num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}