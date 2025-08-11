class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int len = queries.length;
        int[] ans = new int[len];
        List<Integer> pow = new ArrayList<>();
        int x=1;
        while(n>0){
            if(n%2==1) pow.add(x);
            n = n/2;
            x = x*2;
        }
        for(int i=0 ; i<len ; i++){
            long cur = 1;
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= end; j++) {
                cur = (cur * pow.get(j)) % 1000000007;
            }
            ans[i] = (int) cur;
        }
        return ans;
    }
}