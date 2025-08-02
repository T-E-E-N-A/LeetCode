// Last updated: 8/2/2025, 11:34:49 PM
class Solution {
    public int arrayNesting(int[] nums) {
        int ans=1;
        int c=1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=-1){
                int j=i;
                c=0;
                while(j<nums.length && nums[j]!=-1){
                    c++;
                    int temp=j;
                    j = nums[j];
                    nums[temp]=-1;
                }
            }
            ans = Math.max(c,ans);
        }
        return ans;
    }
}