// Last updated: 8/2/2025, 11:28:48 PM
class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int sum=0;
        int min=Integer.MIN_VALUE;
        for(int i:set){
            if(i>0) sum += i;
            else min = Math.max(min,i);
        }
        if(sum==0 && !set.contains(0)) sum = min;
        return sum;
    }
}