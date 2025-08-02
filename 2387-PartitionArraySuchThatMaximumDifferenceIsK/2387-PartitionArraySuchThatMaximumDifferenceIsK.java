// Last updated: 8/2/2025, 11:31:03 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int a=nums[0];
        int c=1;
        // 1 2 3 4 5 6
        for(int i=1; i<nums.length ; i++){
            if(nums[i]>a+k){
                c++;
                a=nums[i];
            }
        }
        return c;
    }
}