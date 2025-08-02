// Last updated: 8/2/2025, 11:31:35 PM
class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length*grid[0].length];
        int ind=0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                arr[ind++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int ans=0;
        int mid = arr[arr.length/2];
        for(int ele : arr){
            if(Math.abs(ele-mid)%x !=0){
                return -1;
            }
            ans += Math.abs(ele-mid)/x;
        }
        return ans;
    }
}