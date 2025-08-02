// Last updated: 8/2/2025, 11:35:24 PM
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        for(int i=0 ; i<intervals.length ; i++){
            ans[i] = intervals[i][1];
        }
        int j=0;
        for(int i=0 ; i<ans.length ; i++){
            int val =  -1;
            int min = Integer.MAX_VALUE;
            for(j=0 ; j<intervals.length ;j++){
                if(ans[i]==intervals[j][0]){
                    ans[i]=j;
                    break;
                }
                if(ans[i]<=intervals[j][0]){
                    if(val!=-1){
                        if(min>intervals[j][0]){
                            min = intervals[j][0];
                            val=j;
                        }
                    }else{
                        min = intervals[j][0];
                        val = j;
                    }
                }
            }
            System.out.print(ans[i]+" ");
            if(j==intervals.length){
                ans[i]=val;
            }
            System.out.println(ans[i]);
        }
        return ans;
    }
}