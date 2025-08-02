// Last updated: 8/2/2025, 11:32:05 PM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int c=0;
        int sum=0;
        int i=0;
        int start=0;
        HashSet<Integer> set = new HashSet<>();
        while(i<nums.length){
            sum += nums[i];
            if(set.contains(nums[i])){
                while(start<i && i<nums.length) {
                    sum -= nums[start];
                    set.remove(nums[start]);
                    if(nums[start++]==nums[i]) break;
                }
            }
            set.add(nums[i]);
            c = Math.max(c,sum);
            // System.out.println(c);
            i++;
        }
        return c;
    }
}