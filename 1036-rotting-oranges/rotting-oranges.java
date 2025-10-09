class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<pair> qu = new LinkedList<>();
        boolean[][] arr = new boolean[grid.length][grid[0].length];
        int fresh=0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]==2){
                    qu.add(new pair(i,j,0));
                    arr[i][j] = true;
                }else if(grid[i][j]==1) fresh++;
            }
        }
        int ans=0;
        while(!qu.isEmpty()){
            int n = qu.size();
            for(int i=0 ; i<n ; i++){
                pair x = qu.poll();
                int[] r = {-1,0,0,1};
                int[] c = {0,-1,1,0};
                for(int k=0 ; k<4 ; k++){
                    if(x.i+r[k]>=0 && x.i+r[k]<arr.length && x.j+c[k]>=0 && x.j+c[k]<arr[0].length && !arr[x.i+r[k]][x.j+c[k]] && grid[x.i+r[k]][x.j+c[k]]==1){
                        qu.add(new pair(x.i+r[k],x.j+c[k],x.lvl+1));
                        grid[x.i+r[k]][x.j+c[k]]=2;
                        arr[x.i+r[k]][x.j+c[k]] = true;
                        fresh--;
                    }
                }
                ans = Math.max(ans,x.lvl);
            }
        }
        if(fresh>0) return -1;
        return ans;
    }
    class pair{
        int i;
        int j;
        int lvl;
        public pair(int i,int j,int lvl){
            this.i=i;
            this.j=j;
            this.lvl=lvl;
        }
    }
}