// Last updated: 8/2/2025, 11:31:59 PM
class Solution {
    public boolean checkPowersOfThree(int n) {
        // 91 = 91%3==1 i.e. 3^0    30*3+1          here 1 means 3^0
        // 91/3 = 30 = 30%3==0      10*3*3          here 0 means no 3 power 3^1 not present
        // 30/3=10 => 10%3==1       (3*3 +1)*3*3 +1 here 1 means 3^2
        // 10/3=3 =>  3%3==0        i.e. 3^3 doesn't exist
        // 3/3=1 => 1%3==1          i.e. 3^4 + 3^2 + 3^0
        while(n>0){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}