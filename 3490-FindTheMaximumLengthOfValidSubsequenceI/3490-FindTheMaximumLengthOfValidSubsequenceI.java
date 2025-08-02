// Last updated: 8/2/2025, 11:29:34 PM
class Solution {
    public int maximumLength(int[] nums) {
        int odd=0,even=0,cnt=0;
        boolean flag = (nums[0]%2==0);
        for(int num:nums){
            if(num%2==0){
                if(flag){
                    flag = !flag;
                    cnt++;
                }
                even++;
            }else{
                if(!flag){
                    flag = !flag;
                    cnt++;
                }
                odd++;
            }
        }
        return Math.max(cnt,Math.max(odd,even));
    }
}