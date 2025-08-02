// Last updated: 8/2/2025, 11:36:19 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0 || n<0){
            return false;
        }
        int a = n&(n-1);
        if(a==0){
            return true;
        }
        else return false;
    }
}