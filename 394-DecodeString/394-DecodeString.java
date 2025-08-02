// Last updated: 8/2/2025, 11:35:35 PM
class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==']'){
                StringBuilder str = new StringBuilder();
                while(st.peek()!='['){
                    str.insert(0,st.pop());
                }
                st.pop();
                int a = st.pop()-'0';
                if(!st.isEmpty() && st.peek()-'0'>=0 && st.peek()-'0'<10){
                    a = a + 10*(st.pop()-'0');
                }
                if(!st.isEmpty() && st.peek()-'0'>=0 && st.peek()-'0'<10){
                    a = a + 100*(st.pop()-'0');
                }
                String app = str.toString();
                for(int j=0 ; j<a-1 ; j++){
                    str.append(app);
                }
                for(int j=0 ; j<str.length() ; j++){
                    st.push(str.charAt(j));
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.insert(0,st.pop());
        }
        return str.toString();
    }
}