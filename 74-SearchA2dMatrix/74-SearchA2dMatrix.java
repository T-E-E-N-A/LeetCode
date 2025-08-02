// Last updated: 8/2/2025, 11:56:25 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(target<matrix[i][j]){
                j--;
            }else if(target>matrix[i][j]){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}