// Last updated: 8/2/2025, 11:35:44 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix[0].length;
        int[] arr = new int[matrix.length * row];
        int ind=0;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<row ; j++){
                arr[ind] = matrix[i][j];
                ind++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}