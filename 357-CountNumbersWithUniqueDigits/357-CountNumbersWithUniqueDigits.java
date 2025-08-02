// Last updated: 8/2/2025, 11:35:48 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // permutation and combination image of n seats
        return answer(n);
    }
    public int answer(int n){
        if(n==0){
            return 1;
        }
        int ans=1;
        int num=9;
        for(int i=0 ; i<n && num>0; i++){
            ans = ans*num;
            if(i!=0){
                num--;
            }
        }
        return ans + answer(n-1);
    }
}