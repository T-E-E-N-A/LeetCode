class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        while(i<j){
            ans = Math.max(ans,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}


/*
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && height[st.peek()]<height[i]){
                ans = Math.max(ans,(i-st.peek())*Math.min(height[i],height[st.peek()]));
                st.pop();
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int i = st.pop();
            if(!st.isEmpty())
                ans = Math.max(ans,(i-st.peek())*height[i]);
            else
                ans = Math.max(ans,height[i]*(i));
        }
        return ans;
    }
}
*/