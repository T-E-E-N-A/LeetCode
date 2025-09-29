class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] arr = new boolean[board.length][board[0].length];
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                if(board[i][j]==word.charAt(0) && fun(board,word,i,j,0,arr)) return true;
            }
        }
        return false;
    }
    public boolean fun(char[][] board, String word, int i,int j, int st, boolean[][] arr){
        if(st==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || arr[i][j] || board[i][j]!=word.charAt(st)) return false;

        arr[i][j] = true;

        int[] r = {-1,0,0,1};
        int[] c = {0,-1,1,0};
        for(int k=0 ; k<4 ; k++){
            if(fun(board,word,i+r[k],j+c[k],st+1,arr)) return true;
        }
        arr[i][j] = false;
        return false;
    }
}