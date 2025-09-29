class Solution {
    public void rotate(int[][] matrix) {
        // transpose then reverse
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<i ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // now reverse
        for(int i=0 ; i<matrix.length ; i++){
            int j=0,end=matrix.length-1;
            while(j<end){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][end];
                matrix[i][end] = temp;
                j++;
                end--;
            }
        }
    }
}