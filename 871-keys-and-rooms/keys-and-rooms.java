class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(vis,rooms,0);
        for(int i=0 ;i<rooms.size() ; i++){
            if(!vis[i]) return false;
        }
        return true;
    }
    public void dfs(boolean[] vis, List<List<Integer>> rooms, int idx){
        if(vis[idx]) return;

        vis[idx]= true;
        for(int i : rooms.get(idx)){
            if(!vis[i]){
                dfs(vis,rooms,i);
            }
        }
    }
}