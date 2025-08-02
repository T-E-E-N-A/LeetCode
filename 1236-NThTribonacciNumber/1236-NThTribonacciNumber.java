// Last updated: 8/2/2025, 11:33:18 PM
class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        int d=a+b+c;
        if(n<=1) return n;
        else if(n==2) return c;
        for(int i=4 ; i<=n ; i++){
            a=b;
            b=c;
            c=d;
            d=a+b+c;
        }
        return d;
    }
}