// Last updated: 8/2/2025, 11:57:46 PM
class Solution {
    public int reverse(int x) {
        long sum=0;
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE){
            return 0;
        }
        while(x!=0){
            int rem = x%10;
            sum = sum*10 + rem;
            x/=10;
        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE){
            return 0;
        }
        return (int)sum;
    }
}