// Last updated: 8/2/2025, 11:55:13 PM
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>0){
            n /=5;
            c += n;
        }
        return c;
    }
}