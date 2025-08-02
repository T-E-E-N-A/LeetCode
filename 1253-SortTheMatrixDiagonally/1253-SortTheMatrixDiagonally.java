// Last updated: 8/2/2025, 11:33:15 PM
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        // 1st row starters sorting
        for(int i=0 ; i<n-1 ; i++){
            List<Integer> li = new ArrayList<>();
            // now 1st index is selected like 00 10 20 30
            int j=i;
            int k=0;
            while(j<n && k<m){
                li.add(mat[j++][k++]);
            }
            Collections.sort(li);
            k=0;j=i;
            while(j<n && k<m && k<li.size()){
                mat[j++][k] = li.get(k);
                k++;
            }
        }

        // 1st column starters sorting
        for(int i=1 ; i<m-1 ; i++){
            List<Integer> li = new ArrayList<>();
            // now 1st index is selected like 00 10 20 30
            int j=i;
            int k=0;
            while(j<m && k<n){
                li.add(mat[k++][j++]);
            }
            Collections.sort(li);
            k=0;j=i;
            while(j<m && k<n && k<li.size()){
                mat[k++][j++] = li.get(k-1);
            }
        }
        return mat;
    }
}