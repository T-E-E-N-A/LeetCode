class Solution {
    public String longestNiceSubstring(String s) {
        return fun(s,0,s.length());
    }
    public String fun(String s,int l,int r){
        if(r-l<2) return "";

        HashSet<Character> set = new HashSet<>();
        for (int i = l; i < r; i++) set.add(s.charAt(i));
        
        for(int i=l ; i<r ; i++){
            if(!set.contains(Character.toLowerCase(s.charAt(i))) || !set.contains(Character.toUpperCase(s.charAt(i)))){
                String left = fun(s,l,i);
                String right = fun(s,i+1,r);
                return (left.length()>=right.length()?left:right);
            }
        }
        return s.substring(l,r);
    }
}