class Solution {
    public int minCostConnectPoints(int[][] points) {
        boolean[] vis = new boolean[points.length];
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new PrimsPair(points[0],points[0],0));
        int ans=0;
        while(!pq.isEmpty()){
            PrimsPair x = pq.poll();
            if(vis[x.idx]) continue;
            vis[x.idx]=true;
            ans += x.cost;
            for(int i=0 ; i<points.length ; i++){
                if(vis[i]) continue;
                pq.add(new PrimsPair(points[i],x.vtx,i));
            }
        }
        return ans;
    }

    public int cost(int[] x,int[] y){
        return Math.abs(y[0]-x[0]) + Math.abs(y[1]-x[1]);
    }
    class PrimsPair {
		int[] vtx;
		int[] acq_vtx;
		int cost;
        int idx;

		public PrimsPair(int[] vtx, int[] acq_vtx,int idx) {
			this.vtx = vtx;
			this.acq_vtx = acq_vtx;
			this.cost = cost(vtx,acq_vtx);
            this.idx = idx;
		}
	}
}