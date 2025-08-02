// Last updated: 8/2/2025, 11:30:45 PM
class Solution {
    public String robotWithString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char ch : s.toCharArray()){
            st.push(ch);
            freq[ch-'a']--;
            while(!st.isEmpty() && st.peek()<=tellMin(freq)){
                ans.append(st.pop());
            }
        }
        while(!st.isEmpty()) ans.append(st.pop());
        return ans.toString();
    }
    public char tellMin(int[] freq){
        for(int i=0 ; i<26 ; i++){
            if(freq[i]>0) return (char)('a'+i);
        }
        return 'A';
    }
}