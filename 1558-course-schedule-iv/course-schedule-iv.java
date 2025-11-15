class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> ret = new ArrayList<>();
        if(queries.length==0) return ret;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<numCourses ; i++) adj.add(new ArrayList<>());
        for(int[] p : prerequisites){
            adj.get(p[0]).add(p[1]);
        }
        Boolean[][] dp = new Boolean[numCourses][numCourses];
        for(int[] query : queries){
            ret.add(fun(query[0],query[1],adj,new boolean[numCourses],dp));
        }
        return ret;

    }
    private Boolean fun(int a,int b, List<List<Integer>> adj, boolean[] vis,Boolean[][] dp){
        if(vis[b]) return true;
        if(vis[a]) return false;

        if(dp[a][b]!=null) return dp[a][b];

        vis[a] = true;
        for(int nbrs : adj.get(a)){
            if(nbrs==b) return true;
            dp[nbrs][b] = fun(nbrs,b,adj,vis,dp);
            if(dp[nbrs][b]) return true;
        }
        return dp[a][b] = false;
    }
}