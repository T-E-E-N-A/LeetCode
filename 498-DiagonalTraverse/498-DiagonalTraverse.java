// Last updated: 8/2/2025, 11:35:05 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n*m];
        int ind=0;
        int r=0,c=0;
        boolean goesUp = true;
        while(r<n && c<m){
            if(goesUp){
                while(r>=0 && c<m)
                    arr[ind++] = mat[r--][c++];
                if(c==m){
                    r++;
                    c--;
                }
                r++;
                goesUp=false;
            }else{
                while(c>=0 && r<n)
                    arr[ind++] = mat[r++][c--];
                if(r==n){
                    c++;
                    r--;
                }
                c++;
                goesUp=true;
            }
        }
        return arr;
    }
}