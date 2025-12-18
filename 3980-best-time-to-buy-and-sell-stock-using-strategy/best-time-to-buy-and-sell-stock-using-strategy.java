class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n=prices.length;
        long[] prefix = new long[n+1];
        prefix[1] = prices[0]*strategy[0];
        for(int i=1 ; i<n ; i++){
            prefix[i+1] = prefix[i] + (prices[i]*strategy[i]);
        }
        long ans=prefix[n];
        if(k>n) return ans;
        int st=0,j=k/2;
        long sum=0;
        for(int i=k/2 ; i<k && i<prices.length ; i++){
            sum += prices[i];
        }
        while(j+(k/2)<=n){
            long suffix = prefix[st]-prefix[0];
            long pre = prefix[n]-prefix[k+st];
            ans = Math.max(ans,sum+suffix+pre);
            sum -= prices[j];
            if(j+(k/2)<n) sum += prices[j+(k/2)];
            j++;
            st++;
        }
        return ans;
    }
}