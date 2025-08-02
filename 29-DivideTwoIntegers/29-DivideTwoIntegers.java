// Last updated: 8/2/2025, 11:57:13 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1){
            return 2147483647;
        }
        return dividend/divisor;
    }
}