class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        for(int i : nums) sum+=i;
        long find = sum%p;
        if(find==0) return 0;
        int i=0;
        sum=0;
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(0L,-1);
        long ans = Integer.MAX_VALUE;
            System.out.println(find);
        while(i<nums.length){
            sum += nums[i];
            sum = sum%p;

            if(map.containsKey((sum+p-find)%p)){
                ans = Math.min(ans,i-map.get((sum+p-find)%p));
            }
            map.put(sum,i);
            i++;
        }
        return (ans==Integer.MAX_VALUE || ans==nums.length)?-1 : (int)ans;
    }
}
// 17 34 51 68