// Last updated: 8/2/2025, 11:28:25 PM
class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> post = new HashMap<>();
        long ans=0;
        for(int i=0 ; i<nums.length ; i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])==0) map.remove(nums[i]);
            
            long num = nums[i]*2;
            if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE){
                long a = (map.getOrDefault((int)num,0)*(long)post.getOrDefault((int)num,0))%1000000007;
                ans = (ans+a)%1000000007;
            }
            post.put(nums[i],post.getOrDefault(nums[i],0)+1);
        }
        return (int)ans;
    }
}