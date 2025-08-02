// Last updated: 8/2/2025, 11:34:12 PM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);
        int[] ans = new int[worker.length];
        int sum=0;
        int max=profit[0];
        int level=0;
        for(int i=0 ; i<profit.length ; i++){
            if(max<profit[i]){
                level = difficulty[i];
                max = profit[i];
            }
        }
        for(int i=0 ; i<worker.length ; i++){
            if(worker[i]>=level){
                ans[i] = max;
                sum+=ans[i];
                continue;
            }
            for(int j=0 ; j<difficulty.length ; j++){
                if(difficulty[j]<=worker[i]){
                    ans[i] = Math.max(ans[i],profit[j]);
                }
            }
            sum+=ans[i];
        }
        return sum;
    }
}