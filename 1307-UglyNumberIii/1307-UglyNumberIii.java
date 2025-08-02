// Last updated: 8/2/2025, 11:33:08 PM
class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int max= (Math.min(a,(Math.min(b,c))))*n;
        int min=1,ans=Integer.MAX_VALUE;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(isPossible(mid,a,b,c,n)){
                ans = Math.min(ans,mid);
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
    public long gcd(long a, long b) {
        if (a == 0)
            return b;
        else return gcd(b%a, a);
    }
    public boolean isPossible(int mid,int a,int b,int c,int n){
        long x = mid/a;
        long y = mid/b;
        long z = mid/c;
        long lcm = (long)a*b/gcd(a,b);
        long xy = mid/lcm;
        long yz = mid/((long)c*b/gcd(c,b));
        long xz = mid/((long)a*c/gcd(a,c));
        long xyz = mid/(lcm*c/gcd(lcm,c));

        if(x+y+z-xy-yz-xz+xyz >=n ){
            return true;
        }
        return false;
    }
}