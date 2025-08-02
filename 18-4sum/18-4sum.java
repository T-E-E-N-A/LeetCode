// Last updated: 8/2/2025, 11:57:30 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        int start=0,end = nums.length-1,i=1,j=end-1;
        long s=0,sum=0;
        for(start=0 ; start<nums.length ; start++){
            for(end=nums.length -1 ; end>start ; end--){
                s = nums[start]+nums[end];
                i= start+1;
                j = end-1;
                while(i<j){
                    sum = s+nums[i]+nums[j];
                    if(sum==target){
                        if(!li.contains(Arrays.asList(nums[start],nums[i],nums[j],nums[end]))){
                            li.add(Arrays.asList(nums[start],nums[i],nums[j],nums[end]));
                        }
                        j--;
                    }else if(sum<target){
                        i++;
                    }else{
                        j--;
                    }
                }
            }
        }
        return li;
    }
}