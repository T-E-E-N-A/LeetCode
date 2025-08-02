// Last updated: 8/2/2025, 11:35:52 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[][] arr = new int[map.size()][2];
        int i=0;
        for(int keys: map.keySet()){
            arr[i][0] = keys;
            arr[i][1] = map.get(keys);
            i++;
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(b[1],a[1]));
        int[] ans = new int[k];
        for(i=0 ;i<k ;i++){
            ans[i] = arr[i][0];
        }
        return ans;
    }
}