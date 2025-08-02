// Last updated: 8/2/2025, 11:56:46 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> li = new ArrayList<>();
        boolean[][] tell = new boolean[n][n];
        answer(li,n,0,tell);
        return li;
    }
    public void answer(List<List<String>> li,int n , int row , boolean[][] tell){
        if(n==row){
            List<String> lis = new ArrayList<>();
            for(int i=0 ; i<n;i++){
                StringBuilder si = new StringBuilder();
                for(int j=0 ; j<n ; j++){
                    if(tell[i][j]){
                        si.append("Q");
                    }else{
                        si.append(".");
                    }
                }
                lis.add(si.toString());
            }
            li.add(new ArrayList<>(lis));
            return;
        }
        for(int i=0 ; i<n ; i++){
            if(isPossible(n,tell,row,i)){
                tell[row][i] = true;
                answer(li,n,row+1,tell);
                tell[row][i] = false;
            }
        }
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