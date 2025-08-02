// Last updated: 8/2/2025, 11:55:54 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        for(int i=0 ; i<nums.length ; i++){
            qu.add(nums[i]);
        }
        Integer num=qu.poll();
        int c=1;
        int ans=1;
        while(!qu.isEmpty()){
            int a = qu.poll();
            if(num==a) continue;
            if(++num == a) c++;
            else{
                num = a;
                c=1;
            }
            // System.out.println(a+" "+num);
            ans = Math.max(c,ans);
        }
        ans = Math.max(c,ans);
        return ans;
    }
}