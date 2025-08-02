// Last updated: 8/2/2025, 11:57:49 PM
class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0 ; i<s.length();i++){
            String evenLen = possible(s,i,i+1);
            String oddLen = possible(s,i,i);
            if(oddLen.length()>ans.length()){
                ans = oddLen;
            }
            if(evenLen.length()>ans.length()){
                ans = evenLen;
            }
        }
        if(ans.length()==0){
            return s.charAt(0)+"";
        }
        return ans;
    }
    public String possible(String s , int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--; j++;
        }
        return s.substring(i+1,j);
    }
}