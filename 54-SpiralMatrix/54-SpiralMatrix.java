// Last updated: 8/2/2025, 11:56:41 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lis = new ArrayList<>();
		int minc = 0, minr = 0, maxc = matrix[0].length - 1, maxr = matrix.length - 1;
        int c=0;
        int te = matrix.length * matrix[0].length;
        while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				lis.add(matrix[minr][i]);
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				lis.add(matrix[i][maxc]);
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				lis.add(matrix[maxr][i]);
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				lis.add(matrix[i][minc]);
				c++;
			}
			minc++;
		}
        return lis;
    }
}