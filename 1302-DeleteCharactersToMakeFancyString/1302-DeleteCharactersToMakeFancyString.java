// Last updated: 8/2/2025, 11:33:11 PM
class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        str.append(s.charAt(1));
        for(int i=2 ; i<s.length() ;i++){
            if(!(s.charAt(i)==s.charAt(i-2) && s.charAt(i-1)==s.charAt(i))){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}