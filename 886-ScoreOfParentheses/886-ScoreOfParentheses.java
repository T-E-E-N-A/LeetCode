// Last updated: 8/2/2025, 11:34:05 PM
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ;i<s.length() ; i++){
            if(s.charAt(i)=='(') st.push('(');
            else{
                if(st.peek()=='('){
                    st.pop();
                    st.push('1');
                }else{
                    int sum=0;
                    while(st.peek()!='('){
                        sum += (st.pop()-'0');
                    }
                    st.pop();
                    sum = sum*2;
                    st.push((char)('0'+sum));
                }
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum += (st.pop()-'0');
        }
        return sum;
    }
}