// Last updated: 8/2/2025, 11:30:27 PM
class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return check(grid,0,0,0);
    }
    public boolean check(int[][] grid,int row,int col,int i){
        if(i==grid.length*grid[0].length){
            return true;
        }
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length){
            return false;
        }
        if(grid[row][col]==i){
            // check all conditions here
            int[] r = {-2,2,-2,2,-1,1,-1,1};
            int[] c = {-1,-1,1,1,-2,-2,2,2};
            for(int j=0;j<8;j++){
                if(check(grid,row+r[j],col+c[j],i+1)){
                    return true;
                }
            }
        }
        return false;
    }
}