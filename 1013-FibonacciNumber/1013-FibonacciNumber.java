// Last updated: 8/2/2025, 11:33:39 PM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int c=a+b;
        if(n<=1) return n;
        else if(n==2) return c;
        for(int i=3;i<=n ; i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}