class Solution {
    // A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.
    public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length];
        for(int i=0 ; i<vis.length ; i++){
            if(vis[i]==0){
                if(!bfs(graph,vis,i)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int[][] graph, int[] vis,int i){
        Queue<pair> qu = new LinkedList<>();
        qu.add(new pair(-1,i));
        while(!qu.isEmpty()){
            pair x = qu.poll();
            int color = 0-x.col;
            vis[x.i] = x.col;
            for(int neigh : graph[x.i]){
                if(vis[neigh]==0){
                    qu.add(new pair(color,neigh));
                }else if(vis[neigh]!=color) return false;
            }
        }
        return true;
    }
    class pair{
        int col;
        int i;
        public pair(int color,int val){
            col=color;
            i = val;
        }
    }
}