// Last updated: 8/2/2025, 11:35:37 PM
class Solution {
    public int lastRemaining(int n) {
        if(n==1) return 1;
        return 2*(n/2 - lastRemaining(n/2) + 1);
    }
}