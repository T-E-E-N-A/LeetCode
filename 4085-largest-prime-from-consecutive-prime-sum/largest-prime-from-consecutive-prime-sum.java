class Solution {
    public int largestPrime(int n) {
        // seive of erasthonesis
        boolean[] prime = new boolean[n+1];
        prime[0]=prime[1]=true;
        for(int i=2 ; i*i<=n ; i++){
            if(!prime[i]){
                for(int j=2*i ; j<=n ; j+=i){
                    prime[j]=true;
                }
            }
        }
        // List of prime numbers
        int ans=0,sum=0;
        for(int i=2 ; i<=n ; i++){
            if(!prime[i]){
                sum += i;
                if(sum>n) break;
                if(!prime[sum]) ans=sum;
            }
        }
        return ans;
    }
}