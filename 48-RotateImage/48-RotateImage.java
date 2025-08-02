// Last updated: 8/2/2025, 11:56:50 PM
class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        reverse(arr);
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                int temp=arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] arr ){
        for(int k=0 ; k<arr[0].length ; k++){
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                int temp = arr[i][k];
                arr[i][k] = arr[j][k];
                arr[j][k] = temp;
                i++;
                j--;
            }
        }
    }
}