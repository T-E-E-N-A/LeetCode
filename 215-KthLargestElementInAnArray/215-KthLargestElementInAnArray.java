// Last updated: 8/2/2025, 11:36:27 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<nums.length ; i++){
            qu.add(nums[i]);
        }
        for(int i=1 ;i<k ; i++){
            qu.remove();
        }
        return qu.remove();
    }
}