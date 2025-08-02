// Last updated: 8/2/2025, 11:30:10 PM
class Solution {
    public String smallestString(String s) {
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<s.length() && s.charAt(i)=='a'){
            if(i==s.length()-1) str.append('z');
            else str.append('a');
            i++;
        }

        for( ; i<s.length();i++){
            if(s.charAt(i)!='a'){
                str.append((char)(s.charAt(i)-1));
            }else{
                break;
            }
        }
        if(i<s.length()) str.append(s.substring(i));
        return str.toString();
    }
}