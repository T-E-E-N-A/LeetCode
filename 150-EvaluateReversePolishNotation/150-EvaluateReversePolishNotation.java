// Last updated: 8/2/2025, 11:55:32 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str : tokens){
            if(str.equals("+")){
                st.push(st.pop() + st.pop());
            }else if(str.equals("-")){
                int b = st.pop();
                st.push(st.pop() - b);
            }else if(str.equals("*")){
                st.push(st.pop() * st.pop());
            }else if(str.equals("/")){
                int b = st.pop();
                st.push(st.pop() / b);
            }else{
                st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
}