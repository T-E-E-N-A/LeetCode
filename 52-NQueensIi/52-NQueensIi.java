// Last updated: 8/2/2025, 11:56:44 PM
class Solution {
    public int totalNQueens(int n) {
        boolean[][] tell = new boolean[n][n];
        return answer(n,0,tell);
    }
    public int answer(int n , int row , boolean[][] tell){
        if(n==row){
            return 1;
        }
        int c=0;
        for(int i=0 ; i<n ; i++){
            if(isPossible(n,tell,row,i)){
                tell[row][i] = true;
                c += answer(n,row+1,tell);
                tell[row][i] = false;
            }
        }
        return c;
    }
    public boolean isPossible(int n,boolean[][] tell,int row,int col){
        // vertical
        for(int i=0 ; i<row ; i++){
            if(tell[i][col]){
                return false;
            }
        }
        // left diagonal
        int r = row,c=col;
        while(r>=0 && c>=0){
            if(tell[r][c]){
                return false;
            }
            r--;
            c--;
        }

        // right diagonal
        r = row;
        c=col;
        while(r>=0 && c<n){
            if(tell[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}