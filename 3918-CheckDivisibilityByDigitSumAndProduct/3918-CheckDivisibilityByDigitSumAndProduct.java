// Last updated: 8/2/2025, 11:28:21 PM
class Solution {
    public boolean checkDivisibility(int n) {
        if(n%(summ(n)+pro(n))==0) return true;
        return false;
    }
    public int summ(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public long pro(int n){
        long prod=1;
        while(n>0){
            prod *= n%10;
            n/=10;
        }
        return prod;
    }
}