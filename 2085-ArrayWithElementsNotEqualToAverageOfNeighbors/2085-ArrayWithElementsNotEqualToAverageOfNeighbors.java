// Last updated: 8/2/2025, 11:31:41 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        // 1 5 3 
        for(int i=1 ; i<nums.length-1 ;i++){
            if((nums[i-1]+nums[i+1])/2==nums[i]){
                //  swap nums[i] with nums[i+1]
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                if(i>1)
                i-=2;
            }
        }
        return nums;
    }
}