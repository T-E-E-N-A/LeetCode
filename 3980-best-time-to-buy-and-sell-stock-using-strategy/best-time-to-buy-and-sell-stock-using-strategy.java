class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        long sum=0,ans = 0;
        for(int i=0;i<prices.length ; i++) ans += prices[i]*strategy[i];
        for(int i=k/2 ;i<prices.length && i<k ; i++) sum += prices[i];
        for(int i=k ; i<prices.length ; i++) sum += (prices[i]*strategy[i]);
        

        int start=0,mid=k/2,end=k;
        ans = Math.max(ans,sum);
        while(end<strategy.length){
            sum -= prices[mid];
            sum -= (prices[end]*strategy[end]);
            sum += (prices[start]*strategy[start]);
            sum += prices[end];

            start++;
            mid++;
            end++;
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}