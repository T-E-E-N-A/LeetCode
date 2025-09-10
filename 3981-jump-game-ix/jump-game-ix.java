class Solution {
    public int[] maxValue(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0]= nums[0];
        for(int i=1 ; i<nums.length ; i++) ans[i]= Math.max(ans[i-1],nums[i]);
        int min=nums.length-1;
        for(int i=nums.length-1 ; i>=0 ; i--){
            if(nums[min]<ans[i]) ans[i] = Math.max(ans[i],ans[min]);
            if(nums[min]>nums[i]) min = i;
        }
        return ans;
    }
}