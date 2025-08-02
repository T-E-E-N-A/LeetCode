// Last updated: 8/2/2025, 11:55:02 PM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return primeSeive(n);
    }

    public static int primeSeive(int n) {
        boolean[] ans = new boolean[n];
        ans[0] = ans[1] = true;
        for(int i=2;i*i<=ans.length ; i++){
            if(!ans[i]){//prime
                for(int j=2; i*j<ans.length ; j++){
                    ans[i*j] = true;
                }
            }
        }

        int count=0;
        for(int i=0; i<n ; i++){
            if(!ans[i]){
                count++;
            }
        }
        return count;
    }
}