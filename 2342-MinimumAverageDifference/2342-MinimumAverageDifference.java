// Last updated: 8/2/2025, 11:31:06 PM
class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sc=0,sa=0,lc=nums.length,la=0;
        for(int i=nums.length-1 ; i>=0 ; i--){
            la += nums[i];
        }
        int ans = Integer.MAX_VALUE;
        int idx = 0;
        for(int i=0 ; i<nums.length ; i++){
            sa += nums[i];
            la -= nums[i];
            sc++;lc--;
            int diff = (int)(sa/sc);
            if(lc!=0) diff = Math.abs(diff - (int)(la/lc));
            if(ans>diff){
                ans = diff;
                idx = i;
            }
            if(i==99998 || i==99999)
            System.out.println(la+" "+sa);
        }
        return idx;
    }
}