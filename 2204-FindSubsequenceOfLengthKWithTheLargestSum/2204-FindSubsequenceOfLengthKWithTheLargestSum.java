// Last updated: 8/2/2025, 11:31:29 PM
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        int[] copy = nums.clone();
        Arrays.sort(copy);
        int c=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums.length-1 ;i>=0 ; i--){
            map.put(copy[i],map.getOrDefault(copy[i],0)+1);
            c++;
            if(c==k) break;
        }
        int j=0;
        for(int i=0 ;i<nums.length && j<k ; i++){
            if(map.getOrDefault(nums[i],0)>0){
                ans[j++] = nums[i];
                map.put(nums[i],map.get(nums[i])-1);
            }
        }
        return ans;
    }
}