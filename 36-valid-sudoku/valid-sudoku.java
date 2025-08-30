class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ;j<9 ; j++) if(board[i][j]!='.' && !isValid(board,i,j)) return false;
        }
        return true;
    }

    public boolean isValid(char[][] board,int row,int col){
        char val = board[row][col];
        for(int r=0 ; r<board.length ; r++){
            if(r==row) continue;
            if(board[r][col]==val) return false;
        }
        for(int c=0 ; c<board.length ; c++){
            if(c==col) continue;
            if(board[row][c]==val) return false;
        }
        // To check in 3x3 matrix
        int r = row/3*3;
        int c = col/3*3;
        for(int i=r ; i<r+3 ; i++){
            for(int j=c ; j<c+3 ; j++){
                if(i==row && j==col) continue;
                if(board[i][j]==val) return false;
            }
        }
        return true;
    }
}