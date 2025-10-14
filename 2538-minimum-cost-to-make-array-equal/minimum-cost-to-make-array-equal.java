class Solution {
    public long minCost(int[] nums, int[] cost) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i : nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        long ans=0;
        while(min<max){
            int mid = min + (max-min)/2;
            long y1 = find(nums,cost,mid);
            long y2 = find(nums,cost,mid+1);
            ans = Math.min(y1,y2);
            if(y2>y1){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }

    public static long find(int[] nums,int[] cost,int mid){
        long ans=0;
        for(int i=0 ; i<nums.length ; i++){
            ans += Math.abs(nums[i]-mid)*(long)cost[i];
        }
        return ans;
    }
}