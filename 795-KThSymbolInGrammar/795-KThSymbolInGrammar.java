// Last updated: 8/2/2025, 11:34:18 PM
class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1 || k==1) return 0;
        int ki = k/2;
        if(k%2==1) ki++;
        int a = kthGrammar(n-1,ki);
        if(k%2==1) return a;
        if(a==1) return 0;
        return 1;
    }
}