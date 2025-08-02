// Last updated: 8/2/2025, 11:34:04 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int [][] arr = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
			for (int j =0; j < matrix[0].length; j++) {
				arr[j][i]=matrix[i][j];
			}
		}
        return arr;
    }
}