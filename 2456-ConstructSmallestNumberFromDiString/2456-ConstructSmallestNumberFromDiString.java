// Last updated: 8/2/2025, 11:30:56 PM
class Solution {
    public String smallestNumber(String pattern) {
        int[] ans = answer(pattern);
        StringBuilder str = new StringBuilder();
        for(int i=0; i<=pattern.length() ; i++){
            str.append(ans[i]+"");
        }
        return str.toString();
    }
    public int[] answer(String pattern){
        int[] ans = new int[pattern.length()+1];
        Stack<Integer> st = new Stack<>();
        int c=1;
        for(int i=0;i<pattern.length() ; i++){
            if(pattern.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()] = c;
                    c++;
                }
            }else{
                st.push(i);
            }
        }
        st.push(pattern.length());
        while(!st.isEmpty()){
            ans[st.pop()] = c;
            c++;
        }
        return ans;
    }
}