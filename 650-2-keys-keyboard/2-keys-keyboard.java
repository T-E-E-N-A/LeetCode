class Solution {
    public int minSteps(int n) {
        // n is prime direct n is answer
        int ans=0;
        for(int i=2 ; i<=n ; i++){
            if(n%i==0){
                ans+=i;
                n/=i;
                i--;
            }
            if(n==1) return ans;
        }
        if(n==1) return ans;
        return n+ans;
    }
}