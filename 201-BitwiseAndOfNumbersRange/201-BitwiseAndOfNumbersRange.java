// Last updated: 8/2/2025, 11:55:04 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0){
            return 0;
        }
        if(left==1 && right!=1){
            return 0;
        }
        int ans=right;
        while(ans>left){
            ans = ans & ans-1;
        }
        return ans;
    }
}