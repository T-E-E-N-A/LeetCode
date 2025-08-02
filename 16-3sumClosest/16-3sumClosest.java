// Last updated: 8/2/2025, 11:57:34 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        List<Integer> li = new ArrayList<>();
        for(int i=0 ; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start=i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum>target){
                    max = Math.min(sum,max);
                    end--;
                }else if(sum<target){
                    min = Math.max(sum,min);
                    start++;
                }else{
                    return target;
                }
            }
        }
        if(max!=Integer.MAX_VALUE && min!=Integer.MIN_VALUE){
            if(Math.abs(max-target)>Math.abs(min-target)){
                return min;
            }else{
                return max;
            }
        }
        if(max!=Integer.MAX_VALUE){
            return max;
        }
        return min;
    }
}