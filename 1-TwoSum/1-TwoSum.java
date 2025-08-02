// Last updated: 8/2/2025, 11:57:56 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0 ; i<(nums.length)-1 ; i++){
            for(int j=i+1 ; j<(nums.length) ; j++){
                if(nums[i]+nums[j]==target){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        int[] arr= new int[2];
        return arr;
    }
}