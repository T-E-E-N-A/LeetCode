// Last updated: 8/2/2025, 11:35:38 PM
class Solution {
    public char findTheDifference(String s, String t) {
        for(int i=0 ; i<t.length() ; i++){
            int in =s.indexOf(t.charAt(i));
            if(in ==-1){
                return t.charAt(i);
            }else{
                s = s.substring(0,in) + s.substring(in+1,s.length());
            }
        }
        return 'a';
    }
}