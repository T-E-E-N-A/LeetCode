class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]=='1'){
                    traverse(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public void traverse(char[][] grid , int i , int j){
        int[] r = {-1,0,0,1};
        int[] c = {0,-1,1,0};
        for(int row=0 ; row<4 ; row++){
            if(r[row]+i<grid.length && c[row]+j<grid[0].length && r[row]+i>=0 && c[row]+j>=0 && grid[r[row]+i][c[row]+j]=='1'){
                grid[r[row]+i][c[row]+j] = '0';
                traverse(grid,r[row]+i,c[row]+j);
            }
        }
    }
}