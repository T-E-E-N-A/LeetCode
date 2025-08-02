// Last updated: 8/2/2025, 11:30:59 PM
class Solution {
    public int equalPairs(int[][] grid) {
        int ans=0;
        for(int i=0; i<grid.length ; i++){
            for(int k=0 ;k<grid.length ; k++){
                if(grid[i][0]==grid[0][k]){
                    boolean flag=true;
                    for(int j=0; j<grid.length ; j++){
                        if(grid[i][j]!=grid[j][k]){
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}