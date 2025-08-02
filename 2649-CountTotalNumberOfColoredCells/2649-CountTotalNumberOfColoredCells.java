// Last updated: 8/2/2025, 11:30:29 PM
class Solution {
    public long coloredCells(int n) {
        n = n-1;
        // return 1 + Sn
        // Sn = n*(2a + (n-1)*d)/2;
        // a.p : 4,8,12,16....
        // s.n : 4,12,24,40....
        return 1 + (2*4 + ((long)n-1)*4)*(n)/2;
    }
}