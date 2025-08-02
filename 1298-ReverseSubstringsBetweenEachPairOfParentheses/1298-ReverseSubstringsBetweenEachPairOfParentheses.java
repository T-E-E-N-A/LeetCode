// Last updated: 8/2/2025, 11:33:12 PM
class Solution {
    public String reverseParentheses(String s) {
        int[] i = {0};
        return (helper(s,i)).toString();
    }
    public StringBuilder helper(String s, int[] i){
        StringBuilder ans = new StringBuilder();
        for( ; i[0]<s.length() ; i[0]++){
            if(s.charAt(i[0])==')') return new StringBuilder(ans.reverse());
            else if(s.charAt(i[0])=='('){
                i[0]++;
                StringBuilder str = helper(s,i);
                ans.append(str);
            }else{
                ans.append(s.charAt(i[0]));
            }
        }
        return new StringBuilder(ans);
    }
}