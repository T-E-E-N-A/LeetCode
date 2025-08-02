// Last updated: 8/2/2025, 11:35:32 PM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        // increasing stack
        for(int i=0 ; i<num.length() ; i++){
            while(!st.isEmpty() && k>0 && num.charAt(st.peek())>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(i);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            ans.append(num.charAt(st.pop()));
        }
        while(ans.length()>0 && ans.charAt(ans.length()-1)=='0'){
            ans.deleteCharAt(ans.length()-1);
        }
        if(ans.length()==0) return "0";
        return ans.reverse().toString();
    }
}