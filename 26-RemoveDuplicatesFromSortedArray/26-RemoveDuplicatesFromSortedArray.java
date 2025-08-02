// Last updated: 8/2/2025, 11:57:17 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int count=1;
        int c=1;
        while(c<nums.length){
            if(nums[k]==nums[c]){
                c++;
            }else{
                k++;
                nums[k]=nums[c];
                count++;
                c++;
            }
        }
        return count;
    }
}