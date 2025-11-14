class Solution {
    // A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.
    public boolean isBipartite(int[][] graph) {
        // solve it by detecting cycle length is odd or not
        // as bipartite graph cannot have odd length cycle
        HashMap<Integer,Integer> vis = new HashMap<>();
        for(int i=0 ; i<graph.length ; i++){
            if(!vis.containsKey(i)){
                if(!fun(graph,vis,i)) return false;
            }
        }
        return true;
    }
    public boolean fun(int[][] graph, HashMap<Integer,Integer> vis, int i){
        Queue<pair> qu = new LinkedList<>();
        qu.add(new pair(i,0));
        while(!qu.isEmpty()){
            // remove
            pair x = qu.poll();

            if(vis.containsKey(x.vtx)){
                if(vis.get(x.vtx)!=x.dist) return false;
            }

            vis.put(x.vtx,x.dist);
            for(int nbrs : graph[x.vtx]){
                if(!vis.containsKey(nbrs)){
                    qu.add(new pair(nbrs,x.dist+1));
                }
            }
        }
        return true;
    }
    class pair{
        int vtx;
        int dist;
        public pair(int vtx,int dist){
            this.vtx = vtx;
            this.dist = dist;
        }
    }
}