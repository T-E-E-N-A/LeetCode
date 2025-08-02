// Last updated: 8/2/2025, 11:57:05 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i<9 ; i++){
            int[] row = new int[9];
            for(int j=0 ; j<9 ; j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(row[board[i][j]-'1']!=0){
                    return false;
                }else{
                    row[board[i][j]-'1']++;
                }
            }
            int[] col= new int[9];
            for(int j=0 ; j<9 ; j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(col[board[j][i]-'1']!=0){
                    return false;
                }else{
                    col[board[j][i]-'1']++;
                }
            }
        }
        int x=0;
        int plus=-3,minus=0;
        while(x<9){
            if(x%3==0){
                plus+=3;
                minus=0;
            }
            int[] check = new int[9];
            for(int i=0+plus ; i<3+plus ;i++){
                for(int j=0+(minus) ; j<3+minus ; j++){
                    if(board[i][j]=='.'){
                        continue;
                    }
                    if(check[board[i][j]-'1']!=0){
                        return false;
                    }else{
                        check[board[i][j]-'1']++;
                    }
                }
            }
            minus+=3;
            x++;
        }
        return true;
    }
}