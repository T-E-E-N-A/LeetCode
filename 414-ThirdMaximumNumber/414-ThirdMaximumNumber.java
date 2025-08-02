// Last updated: 8/2/2025, 11:35:27 PM
class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE,ind;
        if(nums.length==2){
            return Math.max(nums[1],nums[0]);
        }
        long max3=Long.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
                ind=i;
            }else if(nums[i]>max2 && max1!=nums[i]){
                max3=max2;
                max2 = nums[i];
            }else if(nums[i]>max3 && max2!=nums[i] && nums[i]!=max1){
                max3 = nums[i];
            }
        }
        if(max3==Long.MIN_VALUE){
            return (int)max1;
        }
        return (int)max3;
    }
}