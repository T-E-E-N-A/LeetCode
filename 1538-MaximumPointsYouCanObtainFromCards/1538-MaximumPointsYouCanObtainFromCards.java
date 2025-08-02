// Last updated: 8/2/2025, 11:32:34 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans=0,sum=0;
        for(int i=0 ; i<k ; i++){
            sum += cardPoints[i];
        }
        ans = sum;
        int end = cardPoints.length-1;
        int start=k-1;
        while(end>0 && end>start && start>=0){
            sum -= cardPoints[start--];
            sum += cardPoints[end--];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}