// Last updated: 8/2/2025, 11:56:11 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length];
        int area=0;
        for(int i=0;i<matrix.length ; i++){
            for(int j=0;j<matrix[0].length ; j++){
                if(matrix[i][j]=='0'){
                    heights[j]=0;
                }else{
                    heights[j]++;
                }
            }
            area = Math.max(area,largestRectangle(heights));
        }
        return area;
    }
    public int largestRectangle(int[] heights){
        Stack<Integer> st = new Stack<>();
        int area=0;
        int n = heights.length;
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int h = heights[st.pop()];
                if(st.isEmpty()){
                    area = Math.max(area,h*i);
                }else{
                    area = Math.max(area,h*(i-st.peek()-1));
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            if(st.isEmpty()){
                area = Math.max(area,h*n);
            }else{
                area = Math.max(area,h*(n-st.peek()-1));
            }
        }
        return area;
    }
}