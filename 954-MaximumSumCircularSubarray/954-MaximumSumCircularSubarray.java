// Last updated: 8/2/2025, 11:33:50 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // find maxSum minSum TotalSum
        // circular maxSum = total - minSum
        int max = Integer.MIN_VALUE,sum=0;
        for(int i : nums){
            sum += i;
            max = Math.max(max,sum);
            if(sum<0) sum=0;
        }

        int minSum=Integer.MAX_VALUE;
        sum=0;
        for(int i : nums){
            sum += i;
            if(sum>0) sum=0;
            minSum = Math.min(minSum,sum);
        }

        int total=0;
        for(int i :nums) total += i;
        // now an issue occured ig minSum=totalSum means all negative element,but returning is 0 so to crct this we add
        if(minSum==total) return max;
        return Math.max(total-minSum,max);
    }
}