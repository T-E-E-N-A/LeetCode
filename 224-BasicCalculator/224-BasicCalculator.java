// Last updated: 8/2/2025, 11:36:24 PM
class Solution {
    public int calculate(String s) {
        int[] ind = {0};
        return cal(s,ind);
    }
    public int cal(String s , int[] ind){
        Stack<Integer> st = new Stack<>();
        boolean neg=false;
        for( ; ind[0]<s.length() ; ind[0]++){
            char ch = s.charAt(ind[0]);
            if(ch==' ' || ch=='+') continue;
            else if(ch=='-') neg = true;
            else if(ch=='('){
                ind[0]++;
                int a = cal(s,ind);
                if(neg){
                    st.push(0-a);
                    neg = false;
                }
                else st.push(a);
            }else if(Character.isDigit(ch)){
                int a=0;
                while(ind[0]<s.length() && Character.isDigit(s.charAt(ind[0]))){
                    a = a*10 + (s.charAt(ind[0]++)-'0');
                }
                ind[0]--;
                if(neg){
                    st.push(0-a);
                    neg = false;
                }else {
                    st.push(a);
                }
            }else{
                break;
            }
        }
        int ans=0;
        while(!st.isEmpty()) ans += st.pop();
        return ans;
    }
}