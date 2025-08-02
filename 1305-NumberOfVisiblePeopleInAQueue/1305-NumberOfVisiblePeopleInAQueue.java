// Last updated: 8/2/2025, 11:33:09 PM
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=heights.length-1 ; i>=0 ; i--){
            int c=0;
            while(!st.isEmpty() && heights[st.peek()]<heights[i]){
                st.pop();
                // count for seeing elements which are smaller and not hidden 
                //  as hidden ones are already removed by bigger one in previous looop as their turn is done
                c++;
            }
            // if stack empty nhi h means aage koi bda present h too view=1 only
            // conditional bcs if stack is empty noone is there so can't add 1 directly
            ans[i] = c + (st.isEmpty() ? 0 : 1);
            st.push(i);
        }
        return ans;
    }
}