// Last updated: 8/2/2025, 11:30:53 PM
class Solution {
    public String removeStars(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)!='*'){
                st.push(i);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(s.charAt(st.pop()));
        }
        return str.reverse().toString();
    }
}