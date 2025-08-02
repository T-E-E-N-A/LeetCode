// Last updated: 8/2/2025, 11:33:00 PM
class Solution {
    public boolean isGoodArray(int[] nums) {
        // Eq. ax+by=1 has solution x, y if gcd(a,b) = 1.
        // X AND Y ARE multiples here
        int a = nums[0];
        for(int i=1;i<nums.length ; i++){
            a = gcd(nums[i],a);
            if(a==1){
                return true;
            }
        }
        if(a==1){
            return true;
        }
        return false;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}