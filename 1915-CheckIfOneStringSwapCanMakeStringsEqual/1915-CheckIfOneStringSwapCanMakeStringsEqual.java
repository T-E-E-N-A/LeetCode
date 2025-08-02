// Last updated: 8/2/2025, 11:31:55 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int a=0,b=0,c=0;
        for(int i=0 ; i<s1.length() ; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                b=a;
                a=i;
            }
            if(c>2){
                return false;
            }
        }
        if(c==0){
            return true;
        }
        if(c==2){
            if(s1.charAt(a)==s2.charAt(b) && s1.charAt(b)==s2.charAt(a)){
                return true;
            }
        }
        return false;
    }
}