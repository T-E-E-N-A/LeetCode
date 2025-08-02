// Last updated: 8/2/2025, 11:29:06 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int c=0;
        for(int i=0 ; i<grid.length ; i++){
            if(i%2==0){
                for(int j=0 ; j<grid[i].length ; j++){
                    if(c%2==0){
                        ans.add(grid[i][j]);
                    }
                    c++;
                }
            }else{
                for(int j=grid[0].length-1 ; j>=0 ; j--){
                    if(c%2==0)
                        ans.add(grid[i][j]);
                    c++;
                }
            }
        }
        return ans;
    }
}