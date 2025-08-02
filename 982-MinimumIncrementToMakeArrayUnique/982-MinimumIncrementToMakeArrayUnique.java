// Last updated: 8/2/2025, 11:33:43 PM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int next =0;
        int count=0;
        for(int num : nums){
            next = Math.max(next,num);
            count += next-num;
            next++;
        }
        return count;
    }
}