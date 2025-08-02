// Last updated: 8/2/2025, 11:29:26 PM
class Solution {
    public int possibleStringCount(String word) {
        int ans=1;
        for(int i=1 ; i<word.length() ; i++){
            if(word.charAt(i-1)==word.charAt(i)) ans++;
        }
        return ans;
    }
}