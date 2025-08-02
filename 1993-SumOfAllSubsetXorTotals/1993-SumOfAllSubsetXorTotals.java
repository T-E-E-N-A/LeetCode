// Last updated: 8/2/2025, 11:31:50 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        return answer(nums,0,0,0);
    }
    public int answer(int[] nums,int ind,int xor,int count){
        count+=xor;
        if(ind<0 || ind>=nums.length){
            return count;
        }
        while(ind<nums.length){
            count = answer(nums,ind+1,xor^nums[ind],count);
            ind++;
        }
        return count;
    }
}