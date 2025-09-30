class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (atMost(nums,k)-atMost(nums,k-1));
    }
    public int atMost(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int st=0,i=0;
        int ans=0;
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.size()>k){
                map.put(nums[st],map.get(nums[st])-1);
                if(map.get(nums[st])==0) map.remove(nums[st]);
                st++;
            }
            ans += (i-st+1);
            i++;
        }
        return ans;
    }
}