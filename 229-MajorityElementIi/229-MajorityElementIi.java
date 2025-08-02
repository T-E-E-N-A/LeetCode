// Last updated: 8/2/2025, 11:36:22 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int val = nums.length/3;
        List<Integer> ans = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num)>val) ans.add(num);
        }
        return ans;
    }
}