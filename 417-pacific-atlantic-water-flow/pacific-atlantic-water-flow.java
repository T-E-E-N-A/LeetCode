class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];

        for(int i=0 ; i<heights.length ; i++){
            fun(pacific, heights, i , 0, i, 0);
            fun(atlantic, heights, i, heights[0].length-1, i, heights[0].length-1);
        }

        for(int i=0 ; i<heights[0].length ; i++){
            fun(pacific, heights, 0, i, 0, i);
            fun(atlantic, heights, heights.length-1, i, heights.length-1, i);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ; i<heights.length ; i++){
            for(int j=0 ; j<heights[0].length ; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> lis = new ArrayList<>();
                    lis.add(i);
                    lis.add(j);
                    ans.add(lis);
                }
            }
        }
        return ans;

    }
    public void fun(boolean[][] flag, int[][] heights, int i,int j, int pi, int pj){
        if(i<0 || j<0 || i>=heights.length || j>= heights[0].length || flag[i][j] || heights[i][j]<heights[pi][pj]) return;

        flag[i][j] = true;

        int[] r = {-1,0,0,1};
        int[] c = {0,-1,1,0};
        for(int k=0 ; k<4 ;k++){
            fun(flag,heights,i+r[k],j+c[k],i,j);
        }
    }
}