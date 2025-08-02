// Last updated: 8/2/2025, 11:35:45 PM
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2) return nums.length;
        int[] arr = new int[nums.length-1];
        for(int i=0 ; i<nums.length-1 ;i++){
            arr[i] = nums[i+1]-nums[i];
        }
        int c=0;
        boolean sign = arr[0]>0 ? true : false;
        int i=0;
        while(i<arr.length-1 && arr[i]==0){
            sign = arr[i+1]>0 ? true : false;
            i++;
        }
        for( i=0 ; i<nums.length-1 ; i++){
            if(arr[i]==0) continue;
            if(sign==(arr[i]>0)){
                c++;
                sign = !sign;
            }
        }
        return c+1;
    }
}