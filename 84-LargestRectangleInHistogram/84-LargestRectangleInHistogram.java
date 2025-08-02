// Last updated: 8/2/2025, 11:56:14 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int area=0;
        for(int i=0;i<heights.length ; i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int h = heights[st.pop()];
                if(st.isEmpty()){
                    area = Math.max(area, h*i);
                }else{
                    area = Math.max(area, h*(i-st.peek()-1));
                }
            }
            st.push(i);
        }
        int n = heights.length;
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            if(!st.isEmpty()){
                area = Math.max(area,h*(n-st.peek()-1));
            }else{
                area = Math.max(area,h*n);
            }
        }
        return area;
    }
}