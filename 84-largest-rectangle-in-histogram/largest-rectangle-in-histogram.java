class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0 ; i<heights.length ; i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int h = heights[st.pop()];
                if(st.isEmpty()){
                    ans = Math.max(ans,h*i);
                }else{
                    ans = Math.max(ans,h*(i-st.peek()-1));
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            if(st.isEmpty()){
                ans = Math.max(ans,h*heights.length);
            }else{
                ans = Math.max(ans,h*(heights.length-st.peek()-1));
            }
        }
        return ans;
    }
}