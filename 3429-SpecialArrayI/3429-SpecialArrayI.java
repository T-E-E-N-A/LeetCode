// Last updated: 8/2/2025, 11:29:43 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean even = !(nums[0]%2==0);
        for(int num : nums){
            if(even){
                if(num%2==0){
                    return false;
                }
            }else{
                if(num%2==1){
                    return false;
                }
            }
            even = !even;
        }
        return true;
    }
}