// Last updated: 8/2/2025, 11:57:36 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start=i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum>0){
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    li.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    while(nums[start]==nums[start-1] && start<end){
                        start++;
                    }
                }
            }
        }
        return li;
    }
}