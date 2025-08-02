// Last updated: 8/2/2025, 11:32:01 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int n=0;
        if(word1.length()<word2.length()) n = word1.length();
        else n = word2.length();
        for(int i=0 ; i<n;i++){
            s = s+word1.charAt(i);
            s = s+word2.charAt(i);
        }
        if(word1.length() > n){
            for(int i=n;i<word1.length() ; i++){
                s = s+ word1.charAt(i);
            }
        }else if(word2.length()>n){
            for(int i=n;i<word2.length() ; i++){
                s = s+ word2.charAt(i);
            }
        }
        return s;
    }
}