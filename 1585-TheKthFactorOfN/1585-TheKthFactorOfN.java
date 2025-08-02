// Last updated: 8/2/2025, 11:32:29 PM
class Solution {
    public int kthFactor(int n, int k) {
        int ans=0;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                k--;
            }
            if(k==0){
                return i;
            }
        }
        return -1;
    }
}