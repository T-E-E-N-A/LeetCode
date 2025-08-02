// Last updated: 8/2/2025, 11:34:47 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] fre = new int[26];
        for(int i=0 ;i<s1.length() ; i++){
            fre[s1.charAt(i)-'a']++;
        }
        int start=0,end=s1.length()-1,i=0;
        while(end<s2.length()){
            int[] see = new int[26];
            for(i=0 ; i<s1.length() ; i++){
                see[s2.charAt(i+start)-'a']++;
                if(see[s2.charAt(i+start)-'a']>fre[s2.charAt(i+start)-'a']){
                    break;
                }
            }
            if(i==s1.length()){
                return true;
            }
            start++;
            end++;
        }
        return false;
    }
}