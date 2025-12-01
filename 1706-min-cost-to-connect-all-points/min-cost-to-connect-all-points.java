class Solution {
    public int minCostConnectPoints(int[][] points) {
        boolean[] vis = new boolean[points.length];
        // 0->vtx     1->cost
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{0,0});
        int ans=0;
        while(!pq.isEmpty()){
            int[] x = pq.poll();
            if(vis[x[0]]) continue;
            vis[x[0]]=true;
            ans += x[1];
            for(int i=0 ; i<points.length ; i++){
                if(vis[i]) continue;
                pq.add(new int[]{i,cost(points[i],points[x[0]])});
            }
        }
        return ans;
    }

    public int cost(int[] x,int[] y){
        return Math.abs(y[0]-x[0]) + Math.abs(y[1]-x[1]);
    }
}