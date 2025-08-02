// Last updated: 8/2/2025, 11:36:00 PM
class Solution {
    public void wiggleSort(int[] nums) {
        int[] ans = Arrays.copyOf(nums,nums.length);
        Arrays.sort(ans);
        // swap 1 and 2 then skip 2 numbers
        //  1 2 3 4 5 6 => 1 3 2 4 5 6  => 1 3 2 4 6 5
        // BIG NOOO! what if 1 1 1 2 3 4
        // 1 4 1 3 1 2
        // 1 1 2 2 3 3
        int j=nums.length-1;
        for(int i=1 ;i<nums.length ; i+=2){
            nums[i] = ans[j--];
        }
        for(int i=0 ; i<nums.length ; i+=2){
            nums[i] = ans[j--];
        }
    }
}