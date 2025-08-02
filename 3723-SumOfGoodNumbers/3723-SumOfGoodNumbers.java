// Last updated: 8/2/2025, 11:29:03 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0 ; i<nums.length ; i++){
            if((i-k)>=0){
                if(nums[i-k]<nums[i]){
                    if((i+k)<nums.length){
                        if(nums[i+k]<nums[i]){
                            sum+=nums[i];
                        }
                    }else{
                        sum+=nums[i];
                    }
                }
            }else{
                if((i+k)<nums.length){
                    if(nums[i+k]<nums[i]){
                        sum+=nums[i];
                    }
                }else{
                    sum+=nums[i];
                }
            }
        }
        return sum;
    }
}