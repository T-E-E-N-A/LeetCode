// Last updated: 8/2/2025, 11:30:26 PM
class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int start=nums.length-2,end=nums.length-1;
        int c=0;
        while(start>=0 && end>=0){
            if(nums[start]<nums[end]){
                end--;
                c++;
            }
            start--;
        }
        return c;
    }
}