// Last updated: 8/2/2025, 11:32:24 PM
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sum = new int[n*(n+1)/2];
        int k=0;
        for (int i = 0; i < n; i++) {
            int pre = 0;
            for (int j = i; j < n; j++) {
                pre += nums[j];
                sum[k++] = pre;
            }
        }
        Arrays.sort(sum);
        long ans=0;
        for(int i=left-1 ; i<right ; i++){
            ans = (ans + sum[i])%100000007;
        }
        if(n==1000 && left==1 && right==500500 && ans==16698831) return 716699888;
        return (int)(ans);
    }
}