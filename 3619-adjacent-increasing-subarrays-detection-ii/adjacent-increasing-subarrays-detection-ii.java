class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        List<Integer> lis = new ArrayList<>();
        int c=1;
        for(int i=1 ; i<nums.size() ; i++){
            if(nums.get(i)>nums.get(i-1)) c++;
            else{
                lis.add(c);
                c=1;
            }
        }
        lis.add(c);
        int ans=Math.max(1,lis.get(0)/2);
        for(int i=1 ; i<lis.size() ; i++){
            ans = Math.max(ans,Math.max((Math.max(lis.get(i-1),lis.get(i))/2),Math.min(lis.get(i-1),lis.get(i))));
        }
        return ans;
    }
}