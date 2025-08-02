// Last updated: 8/2/2025, 11:35:01 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int diff=0,c=0,k=0;
        if(word.charAt(0)-'a'>=0){
            c++;
        }else{
            k=-32;
        }
        for(int i=1 ; i<word.length() ; i++){
            if(word.charAt(i)-'a'>=diff){
                c++;
                k=0;
            }else if(word.charAt(i)-'a'>=k && (word.charAt(i)-'A'<32)){
                c++;
                diff=100;
            }else{
                return false;
            }
        }
        return true;
    }
}