class Solution {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        // step 1 : create Graph
        int[][] ll = new int[edges.length][4];
        for(int i=0 ; i<edges.length ; i++){
            ll[i][0]=edges[i][0];
            ll[i][1]=edges[i][1];
            ll[i][2]=edges[i][2];
            ll[i][3]=i;
        }
        // step 2 : find minCost
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

    public int kruskal(int[][] ll,int n,int check,boolean flag){
        DisJoinSet dsu = new DisJoinSet();
		for (int v=0 ; v<n ; v++) dsu.create(v);
		int ans = 0;
        if(!flag){
            // find entry with idx check & add that edge
            for(int[] e : ll){
                if(e[3]==check){
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
        public boolean noMST(){
            Node par = find(map.get(0));
            for(int k : map.keySet()){
                if(find(map.get(k))!=par) return true;
            }
            return false;
        }
    }
}