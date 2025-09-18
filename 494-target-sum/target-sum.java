class Solution {

    public int findTargetSumWays(int[] nums, int target) {
       Map<String, Integer> map = new HashMap<>();
        return fun(nums, target, 0, 0, true,map) + fun(nums, target, 0, 0, false,map);
    }

    public int fun(int[] nums, int target, int i, int sum, boolean plus,Map<String, Integer> map){
        String key = i + "|" + sum + "|" + (plus ? 1 : 0);
        if (map.containsKey(key)) return map.get(key);

        if(sum == target && i == nums.length) return 1;
        if(i == nums.length && sum != target) return 0;

        if(plus) sum += nums[i];
        else sum -= nums[i];

        if(sum == target && i == nums.length - 1) return 1;

        int a = fun(nums, target, i + 1, sum, true,map) + fun(nums, target, i + 1, sum, false,map);
        map.put(key, a);
        return a;
    }
}