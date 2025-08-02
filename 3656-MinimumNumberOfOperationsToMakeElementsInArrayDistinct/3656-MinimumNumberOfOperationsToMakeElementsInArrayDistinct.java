// Last updated: 8/2/2025, 11:29:15 PM

class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=nums.length-1 ; i>=0 ; i--){
            if(set.contains(nums[i])){
                return i/3+1;
            }
            set.add(nums[i]);
        }
        return 0;
    }
}