class Solution {
    public int minimumArea(int[][] grid) {
        boolean[] row = new boolean[grid.length];
        boolean[] col = new boolean[grid[0].length];
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j]==1){
                    row[i]= true;
                    col[j] = true;
                }
            }
        }
        int r=0;
        while(r<row.length && !row[r]) r++;
        int rend=row.length-1;
        while(rend>0 && !row[rend]) rend--;
        int c=0;
        while(c<col.length && !col[c]) c++;
        int cend=col.length-1;
        while(cend>0 && !col[cend]) cend--;
        return (rend-r+1)*(cend-c+1);
    }
}