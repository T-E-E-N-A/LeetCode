// Last updated: 8/2/2025, 11:30:36 PM
class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ;i<nums.length ; i++){
            double y = Math.sqrt(nums[i]);

            if(y!=(int)y) map.put(nums[i],1);
            else if(map.containsKey(nums[i])) continue;
            else if(map.containsKey((int)y)){
                map.put(nums[i],map.get((int)y)+1);
                map.remove((int)y);
            }else map.put(nums[i],1);
            
        }
        int ans=-1;
        for(int i:map.keySet()){
            if(map.get(i)>1)
                ans = Math.max(ans,map.get(i));
        }
        return ans;
    }
}