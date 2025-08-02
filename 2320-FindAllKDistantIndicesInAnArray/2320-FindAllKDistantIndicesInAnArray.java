// Last updated: 8/2/2025, 11:31:08 PM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int r=0; //last element included in list so no repeat and already sorted as index is used and linewise
        List<Integer> ans = new ArrayList<>();
        for(int idx=0 ; idx<nums.length ; idx++){
            if(nums[idx]==key){
                int i= Math.max(idx-k,r);
                // +1 bcoz r is used as element from which we have not included but if we don't do +1 then last element can be included twice
                r = Math.min(idx+k,nums.length-1) + 1;
                for(; i<r; i++){
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}