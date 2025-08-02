// Last updated: 8/2/2025, 11:28:33 PM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        if(grid.length==1 && grid[0].length==1){
            return false;
        }
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                row[i] += grid[i][j];
                col[j] += grid[i][j];
            }
        }
        if(answer(row) || answer(col)) return true;
        return false;
    }
    public boolean answer(int[] arr){
        long sum1=0,sum2=0;
        // 2 pointer
        int start=0,end = arr.length-1;
        while(start<=end){
            if(sum1>sum2) sum2 += arr[end--];
            else sum1 += arr[start++];
        }
        return (start!=0 && end!=arr.length-1) && sum1==sum2;
    }
}