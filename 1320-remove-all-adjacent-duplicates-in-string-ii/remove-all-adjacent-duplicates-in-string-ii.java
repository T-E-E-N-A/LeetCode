class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<pair> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){

            while(!st.isEmpty() && st.peek().cnt==k) st.pop();

            if(!st.isEmpty() && st.peek().ch==s.charAt(i)){
                st.peek().cnt++;
            }else{
                st.push(new pair(s.charAt(i),1));
            }
        }

        while(!st.isEmpty() && st.peek().cnt==k) st.pop();

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            pair x = st.pop();
            ans.append(String.valueOf(x.ch).repeat(x.cnt));
        }
        return ans.reverse().toString();
    }
    class pair{
        char ch;
        int cnt;
        public pair(char ch,int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }
}