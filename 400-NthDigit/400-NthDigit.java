// Last updated: 8/2/2025, 11:35:33 PM
class Solution {
    public int findNthDigit(int n) {
        if(n<10){
            return n;
        }
        // 10-0 = 9*1 = 9
        // 10-99 = 90*2 = 180
        //100-999 = 900*3 = 2700
        // 1000-9999 = 9000*4 = 36000
        // 10000-99999 = 90000*5 = 450000
        // 5400000
        // 63000000
        // 720000000
        // n can be upto 10 digits 
        int x = 9;
        int d=1;
        for(int i=1 ; i<=8 ; i++){
            if(n-i*x >=0){
                n -= (i*x);
                d++;
            }else{
                break;
            }
            x *=10;
        }
        // d - no of digits on which we have to find
        int ans = (int)Math.pow(10,d-1);
        if(n%d==0){
            ans += (n/d)-1;
            return ans%10;
        }
        ans += (n/d);
        return (ans+"").charAt(n%d-1)-'0';
    }
}