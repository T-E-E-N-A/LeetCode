// Last updated: 8/2/2025, 11:34:22 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int col=0,row=0;
        for( ; row<matrix.length ; row++){
            int r=row,c=0;
            int ele = matrix[r][c];
            while(r<matrix.length-1 && c<matrix[0].length-1){
                if(matrix[++r][++c]!=ele){
                    return false;
                }
            }
        }
        for( ; col<matrix[0].length ; col++){
            int r=0,c=col;
            int ele = matrix[r][c];
            while(r<matrix.length-1 && c<matrix[0].length-1){
                if(matrix[++r][++c]!=ele){
                    return false;
                }
            }
        }
        return true;
    }
}