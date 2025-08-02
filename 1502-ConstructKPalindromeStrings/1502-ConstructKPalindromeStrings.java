// Last updated: 8/2/2025, 11:32:50 PM
class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            freq[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0 ; i<26 ; i++){
            if(freq[i]%2!=0){
                c++;
            }
            if(c>k){
                return false;
            }
        }
        return true;
    }
}