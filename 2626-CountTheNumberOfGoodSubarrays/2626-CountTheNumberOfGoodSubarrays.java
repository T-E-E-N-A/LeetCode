// Last updated: 8/2/2025, 11:30:30 PM
class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int start=0;
        long count=0;
        for(int i=0 ; i<nums.length ; i++){
            k -= map.getOrDefault(nums[i],0);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(k<=0){
                map.put(nums[start],map.get(nums[start])-1);
                k += map.get(nums[start]);
                start++;
            }
            count += start;
        }
        return count;
    }
}