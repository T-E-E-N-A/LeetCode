// Last updated: 8/2/2025, 11:55:30 PM
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder si = new StringBuilder();
        int end=s.length()-1,start=s.length()-2;
        while(start>=0){
            if(s.charAt(start)==' '){
                String hell = s.substring(start+1,end+1);
                if(hell.length()>0){
                    si.append(hell + " ");
                }
                end=start-1;
            }
            start--;
        }
        si.append(s.substring(0,end+1));
        return si.toString();
    }
}