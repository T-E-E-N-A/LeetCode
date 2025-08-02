// Last updated: 8/2/2025, 11:56:35 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int c=1;
		int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
        while(c<=n*n){
            for (int i = minc; i <= maxc && c <= n*n; i++) {
				arr[minr][i]=c;
				c++;
			}
			minr++;
            for (int i = minr; i <= maxr && c <= n*n; i++) {
				arr[i][maxc]=c;
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c <=n*n; i--) {
				arr[maxr][i]=c;
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c <= n*n; i--) {
				arr[i][minc]=c;
				c++;
			}
			minc++;
        }
        return arr;
    }
}