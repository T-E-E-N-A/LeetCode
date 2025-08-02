// Last updated: 8/2/2025, 11:34:56 PM
class Solution {
    public int findPairs(int[] nums, int k) {
        int c=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length ;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                continue;
            }
            if(map.containsKey(nums[i]+k)){
                c++;
            }
            if(map.containsKey(nums[i]-k)){
                c++;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==0){
            c=0;
            for(int i:map.keySet()){
                if(map.get(i)>1)
                    c++;
            }
        }
        return c;
    }
}