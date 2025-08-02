// Last updated: 8/2/2025, 11:31:12 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0 ; i<words.length ; i++){
            if(pref.length()>words[i].length()){
                continue;
            }
            if(words[i].substring(0,pref.length()).contains(pref)){
                count++;
            }
        }
        return count;
    }
}