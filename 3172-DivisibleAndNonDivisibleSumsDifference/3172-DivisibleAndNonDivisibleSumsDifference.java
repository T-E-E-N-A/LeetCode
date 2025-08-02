// Last updated: 8/2/2025, 11:29:59 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        // n*(n+1)/2 - m*((n/m)*(n/m+1)/2)
        return ((n*(n+1))/2 - 2*(m*((n/m)*(n/m+1)/2)));
    }
}