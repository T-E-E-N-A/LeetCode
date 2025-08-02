// Last updated: 8/2/2025, 11:28:41 PM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n==1 || n==2){
            return n;
        }
        int a = (int)Math.floor(Math.log(n)/(Math.log(2)) +1);
        return (int)Math.pow(2,a);
    }
}