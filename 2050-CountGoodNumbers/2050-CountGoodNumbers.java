// Last updated: 8/2/2025, 11:31:43 PM
class Solution {
    public int countGoodNumbers(long n) {
        // permutation and combination
        long ans = help(4,(n/2)) * help(5,(n - n/2));
        return (int)(ans  % 1000000007);
    }
    public long help(int x,long n){
        long ans = 1;
        long mul = x;
        while(n>0){
            if(n%2==1){
                // odd
                ans = (ans * mul) % 1000000007;
            }
            mul =(mul*mul)  % 1000000007;
            n /= 2;
        }
        return ans;
    }
}