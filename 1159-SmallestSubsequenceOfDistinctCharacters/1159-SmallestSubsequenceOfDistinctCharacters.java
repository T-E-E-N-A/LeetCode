// Last updated: 8/2/2025, 11:33:26 PM
class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> map  = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            map.put(s.charAt(i),i);
        }
        for(int i=0 ; i<s.length() ; i++){
            if(set.contains(s.charAt(i))) continue;

            while(!st.isEmpty() && s.charAt(i)<s.charAt(st.peek()) && i<map.get(s.charAt(st.peek()))){
                set.remove(s.charAt(st.pop()));
            }
            set.add(s.charAt(i));
            st.push(i);
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(s.charAt(st.pop()));
        }
        return str.reverse().toString();
    }
}