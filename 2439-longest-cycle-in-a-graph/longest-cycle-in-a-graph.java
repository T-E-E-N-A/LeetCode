class Solution {
    public int longestCycle(int[] edges) {
        int[] indeg = new int[edges.length];
        for(int i=0 ; i<edges.length ; i++){
            if(edges[i]!=-1) indeg[edges[i]]++;
        }
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0; i<edges.length ; i++){
            if(indeg[i]==0) qu.add(i);
        }
        boolean[] vis = new boolean[edges.length];
        while(!qu.isEmpty()){
            int x = qu.poll();
            vis[x] = true;
            if(edges[x]!=-1){
                indeg[edges[x]]--;
                if(indeg[edges[x]]==0) qu.add(edges[x]);
            }
        }
        int ans=-1;
        for(int i=0 ; i<edges.length ; i++){
            if(!vis[i]){
                int nbr = edges[i];
                vis[i] = true;
                int len=1;
                while(nbr!=i && edges[i]!=-1){
                    vis[nbr] = true;
                    nbr = edges[nbr];
                    len++;
                }
                ans = Math.max(ans,len);
            }
        }
        return ans;
    }
}