class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num=0;
        char prev='+';
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)) num = num*10 + ch-'0';
            else if(ch!=' '){
                if(prev=='+') st.push(num);
                else if(prev=='-') st.push(-num);
                else if(prev=='*' && !st.isEmpty()){
                    st.push(st.pop()*num);
                }else if(prev=='/' && !st.isEmpty()){
                    st.push(st.pop()/num);
                }
                prev = ch;
                num=0;
            }
        }
        if(prev=='+') st.push(num);
        else if(prev=='-') st.push(-num);
        else if(prev=='*' && !st.isEmpty()){
            st.push(st.pop()*num);
        }else if(prev=='/' && !st.isEmpty()){
            st.push(st.pop()/num);
        }
        int ans=0;
        while(!st.isEmpty()) ans+= st.pop();
        return ans;
    }
}