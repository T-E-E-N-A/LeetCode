// Last updated: 8/2/2025, 11:28:32 PM
class Solution {
    public int countPermutations(int[] complexity) {
        int[] help = complexity.clone();
        Arrays.sort(help);
        if(help[0]!=complexity[0]) return 0;
        int n = complexity.length;
        for(int i=1 ; i<n ; i++){
            if(help[0]==help[i]) {
                return 0;
            }
            else break;
        }
        long ans = factorial(n-1);
        return (int)(ans % 1000000007);
    }
    public long factorial(int n){
        long ans=1;
        for(int i=1 ; i<=n ; i++){
            ans = (ans*i)%1000000007;
        }
        return ans;
    }
}