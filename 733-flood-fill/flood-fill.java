class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] mat = new boolean[image.length][image[0].length];
        traverse(image,sr,sc,color,image[sr][sc],mat);
        image[sr][sc] = color;
        return image;
    }
    public void traverse(int[][] image,int i,int j,int color,int val,boolean[][] mat){
        int[] r = {-1,0,0,1};
        int[] c = {0,-1,1,0};
        for(int k=0 ;k<4 ; k++){
            if(i+r[k]>=0 && j+c[k]>=0 && i+r[k]<image.length && j+c[k]<image[0].length && image[i+r[k]][j+c[k]]==val && !mat[i+r[k]][j+c[k]]){
                mat[i+r[k]][j+c[k]] = true;
                image[i+r[k]][j+c[k]]=color;
                traverse(image,i+r[k],j+c[k],color,val,mat);
            }
        }
    }
}