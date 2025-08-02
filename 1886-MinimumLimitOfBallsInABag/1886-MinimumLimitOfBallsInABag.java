// Last updated: 8/2/2025, 11:32:02 PM
class Solution {
    public int minimumSize(int[] nums, int op) {
        if(nums.length==1){
            if(nums[0]%(op+1)==0){
                return nums[0]/(1+op);
            }
            return nums[0]/(op+1) +1;
        }
        Arrays.sort(nums);
        long space = nums.length+op;
        long low = 0;
        long high = nums[nums.length-1];
        while(low<high){
            long mid = low + (high-low)/2;
            if(isPossible(nums,space,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return (int)high;
    }
    public boolean isPossible(int[] nums,long range , long mid){
        if(mid==0){
            return false;
        }
        long space=0;
        for(int i=0 ; i<nums.length ; i++){
            space += nums[i]/mid;
            if(nums[i]%mid!=0){
                space++;
            }
            if(space>range){
                return false;
            }
        }
        return true;
    }
}