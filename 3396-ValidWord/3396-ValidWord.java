// Last updated: 8/2/2025, 11:29:44 PM
class Solution {
    public boolean isValid(String word) {
        int num=0,v=0,c=0;
        word = word.toLowerCase();
        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            if(ch-'a'>=0 && ch-'a'<26){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') v++;
                else c++;
            }else if(ch-'0'>=0 && ch-'0'<=9) num++;
            else return false;
        }
        if(word.length()>2 && v>0 && c>0) return true;
        return false;
    }
}