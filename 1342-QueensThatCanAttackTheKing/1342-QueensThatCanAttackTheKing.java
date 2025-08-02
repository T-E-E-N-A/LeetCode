// Last updated: 8/2/2025, 11:33:04 PM
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int row=king[0];
        int col=king[1];
        boolean[][] arr = new boolean[8][8];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ; i<queens.length ; i++){
            arr[queens[i][0]][queens[i][1]] = true;
        
        }
        int i=row,j=col;
        int[][] diag = {
            // for diagonals
            {-1,-1},{1,1},{-1,1},{1,-1},
            // for right,down,up,left
            {0,1} , {1,0} , {-1,0} , {0,-1}
        };
        for(int ind=0 ; ind<8; ind++){
            i=row;j=col;
            while(i>=0 && i<8 && j>=0 && j<8){
                if(arr[i][j]){
                    List<Integer> lis  =new ArrayList<>();
                    lis.add(i);
                    lis.add(j);
                    ans.add(new ArrayList<>(lis));
                    break;
                }
                i+=diag[ind][0];
                j+=diag[ind][1];
            }
        }
        return ans;
    }
}