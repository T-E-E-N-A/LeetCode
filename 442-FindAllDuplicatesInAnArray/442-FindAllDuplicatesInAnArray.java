// Last updated: 8/2/2025, 11:35:19 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        answer(nums);
        List<Integer> li = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=(i+1)){
                li.add(nums[i]);
            }
        }
        return li;
    }
    public static void answer(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int ind = nums[i]-1;
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
    }
}