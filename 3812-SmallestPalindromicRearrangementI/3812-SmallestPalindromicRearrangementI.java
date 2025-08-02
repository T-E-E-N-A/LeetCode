// Last updated: 8/2/2025, 11:28:45 PM
class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int[] count = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            count[s.charAt(i)-'a']++;
        }
        StringBuilder first = new StringBuilder();
        StringBuilder last = new StringBuilder();
        char ch='.';
        for(int i=0 ; i<26 ; i++){
            if(count[i]%2!=0) ch = (char)('a'+ i);
            for(int j=0 ;j<count[i]/2 ; j++){
                first.append((char)('a'+i)+"");
                last.insert(0,(char)('a'+i)+"");
            }
        }
        if(ch!='.')
        first.append(ch+"");
        return first.append(last.toString()).toString();
    }
}