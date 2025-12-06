class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int[][] task=new int[technique1.length][2];
        long ans=0;
        for(int i=0;i<technique1.length;i++){
            task[i][0]=technique1[i];
            task[i][1]=technique2[i];
        }
        Arrays.sort(task,(a,b)->(b[0]-b[1])-(a[0]-a[1]));
        for(int i=0;i<technique1.length;i++){
            if(i<k){
                ans+=task[i][0];
            }
            else{
                ans+=(Math.max(task[i][0],task[i][1]));
            }
        }
        return ans;
    }
}