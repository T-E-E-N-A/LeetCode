class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        for(int i=1 ; i<prices.length ; i++){
            if(prices[i-1]<prices[i]){
                ans += prices[i]-prices[i-1];
            }
        }
        return ans;
    }
}
/*
i'll tell you the most basic thing to understand before doing any "Buy and Sell Stock" problem :-

Take ex :- [1,4,7,8,6,4]
if you take (1, 8) , diff = 7
or if you take (1, 4), (4, 7), (7, 8), diff = 3 + 3 + 1 = 7

Going directly to 8, or going to 8 by adding all differences in between is same in result, so rather than thinking to jump, think it in this way.*/