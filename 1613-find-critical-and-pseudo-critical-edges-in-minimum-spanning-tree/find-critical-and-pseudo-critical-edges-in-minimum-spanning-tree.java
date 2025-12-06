// TIME COMPLEXITY = E + Elog(E) + 2*(E+N) + E*4(E+N)
// overall TC : O(ElogE + E*E + E*N)
class Solution {
    // graph-LL
    // 0idx-e1(from) 1idx-e2(to) 2 idx-cost 3idx-i(real idx of edges array)
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int[][] ll = new int[edges.length][4];
        for(int i=0 ; i<edges.length ; i++){
            ll[i][0]=edges[i][0];
            ll[i][1]=edges[i][1];
            ll[i][2]=edges[i][2];
            ll[i][3]=i;
        }

        // step 2 : find minCost
        // sort on base of cost
        Arrays.sort(ll,(a,b)->a[2]-b[2]);
        int minimumCost = kruskal(ll,n,-1,true);

        // answer declaration
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        // step 3:remove one by one
        for(int i=0 ; i<edges.length ; i++){
            int cost = kruskal(ll,n,i,true);
            if(cost==-1 || cost>minimumCost) ans.get(0).add(i);
            else{
                // check critical or pseudo-critical : cost==minimumCost
                int x = kruskal(ll,n,i,false);
                if(x==minimumCost){
                    ans.get(1).add(i);
                }
            }
        }
        return ans;
    }

    // TC-2*(E+N)
    public int kruskal(int[][] ll,int n,int check,boolean flag){
        // used dsu class
        DisJoinSet dsu = new DisJoinSet();
		for (int v=0 ; v<n ; v++) dsu.create(v);
		int ans = 0;
        if(!flag){
            // find entry with idx check
            for(int[] e : ll){
                if(e[3]==check){
                    // add that to dsu
                    int re1 = dsu.find(e[0]);
                    int re2 = dsu.find(e[1]);
                    if (re1 != re2) {
                        dsu.union(re1, re2);
                        ans += e[2];
                    }
                    break;
                }
            }
        }
        for (int[] e : ll) {
            if(e[3]==check && flag) continue;
            int re1 = dsu.find(e[0]);
            int re2 = dsu.find(e[1]);
            if (re1 != re2) {
                dsu.union(re1, re2);
                ans += e[2];
            }
        }
        if(dsu.noMST()) return -1;
        return ans;
    }

    // O(1)- find create union
    // O(N)- noMST
    class DisJoinSet{
        class Node{
            int val;
            int rank;
            Node parent;
        }

        private HashMap<Integer, Node> map = new HashMap<>();

        public void create(int v) {
            Node nn = new Node();
            nn.val = v;
            nn.rank = 0;
            nn.parent = nn;
            map.put(v, nn);
        }
        public int find(int v){
            Node node = map.get(v);
            return find(node).val;
        }
        private Node find(Node node){
            if (node.parent == node) return node;
            Node n = find(node.parent);
            node.parent = n;            // path Compression
            return n;
        }
        public void union(int v1, int v2){
            Node re1 = find(map.get(v1));     // v1 ka node hai
            Node re2 = find(map.get(v2));     // v2 ka node hai
            if (re1.rank == re2.rank) {
                re1.parent = re2;
                re2.rank++;
            } else if (re1.rank < re2.rank){
                re1.parent = re2;
            } else {
                re2.parent = re1;
            }
        }

        // tc : n
        public boolean noMST(){
            Node par = find(map.get(0));
            for(int k : map.keySet()){
                if(find(map.get(k))!=par) return true;
            }
            return false;
        }
    }
}

/*

    TRIED BY PRIMS BUT NOT POSSIBLE😭😭
    KRUSKALS WORKS WITH VERTEX, DSU works for edges

class Solution {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        // lets use brute force 
        // let's delete every edge to check if it's critical or not
        // i am going to do it firstly by prim's(easy than kruskal's)
        // step 1 : create graph 
        List<HashMap<Integer,Integer>> graph = new ArrayList<>();
        graphAdded(graph,edges,n);

        // step 2 : find minCost
        int minimumCost = minCost(graph,n);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());     //critical
        ans.add(new ArrayList<>());     //pseudo-critical

        // step 3 : start deleting edge if minimumCost changes #critical else #non-critical
        for(int i=0 ; i<edges.length ; i++){
            // delete Ith index edge then check mst cost
            deleteEdge(graph,edges[i]);
            int min = minCost(graph,n);
            if(min==minimumCost) ans.get(1).add(i);
            else ans.get(0).add(i);
            addEdge(graph,edges[i]);
        }
        return ans;
    }
    public void deleteEdge(List<HashMap<Integer,Integer>> graph, int[] edge){
        graph.get(edge[0]).remove(edge[1]);
        graph.get(edge[1]).remove(edge[0]);
    }
    public void addEdge(List<HashMap<Integer,Integer>> graph, int[] edge){
        graph.get(edge[0]).put(edge[1],edge[2]);
        graph.get(edge[1]).put(edge[0],edge[2]);
    }

    public int minCost(List<HashMap<Integer,Integer>> graph , int n){
        boolean[] vis = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{0,0});
        int cost=0;
        while(!pq.isEmpty()){
            int[] x = pq.poll();
            if(vis[x[0]]) continue;
            vis[x[0]] = true;
            cost += x[1];
            for(int nbr : graph.get(x[0]).keySet()){
                if(vis[nbr]) continue;
                pq.add(new int[]{nbr,graph.get(x[0]).get(nbr)});
            }
        }
        return cost;
    }
    public void graphAdded(List<HashMap<Integer,Integer>> graph, int[][] edges,int n){
        for(int i=0 ; i<n ; i++) graph.add(new HashMap<>());
        // bidirectional graph as MST
        for(int[] edge : edges){
            graph.get(edge[0]).put(edge[1],edge[2]);
            graph.get(edge[1]).put(edge[0],edge[2]);
        }
    }
}
*/