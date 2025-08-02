// Last updated: 8/2/2025, 11:57:10 PM
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int max=0;
        for(int i=0 ;i<s.length() ; i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                if(!st.isEmpty() && s.charAt(st.peek())=='('){
                    st.pop();
                    if(!st.isEmpty()){
                        max = Math.max(max,i-st.peek());
                    }else{
                        max = Math.max(max,i+1);
                    }
                }else{
                    st.push(i);
                }
            }
        }
        return max;
    }
}