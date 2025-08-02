// Last updated: 8/2/2025, 11:29:55 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean[] arr = new boolean[grid.length*grid[0].length];
        int[] ans = new int[2];
        for(int i=0 ; i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(arr[grid[i][j]-1]==true){
                    ans[0]=grid[i][j];
                }
                arr[grid[i][j]-1]=true;
            }
        }
        for(int i=0;i<arr.length ; i++){
            if(!arr[i]){
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
}