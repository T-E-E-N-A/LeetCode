// Last updated: 8/2/2025, 11:31:33 PM
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(items, (x, y) -> Integer.compare(x[0],y[0]));
        int[] high = new int[items.length];
        int bda=0;
        for(int i=0 ; i<items.length ; i++){
            bda = Math.max(bda,items[i][1]);
            high[i] = bda;
        }
        for(int i=0 ;i<queries.length ; i++){
            int min=0,max=items.length-1;
            int answer=-1;
            while(min<=max){
                int mid = min + (max-min)/2;
                if(queries[i]>=items[mid][0]){
                    answer = mid;
                    min= mid+1;
                }else{
                    max = mid-1;
                }
            }
            if(answer==-1){
                ans[i]=0;
            }else {ans[i] = high[answer];}
        }
        return ans;
    }
}