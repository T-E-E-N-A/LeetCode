// Last updated: 8/2/2025, 11:29:14 PM
class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1) return word;
        String str = "";
        int len = word.length()-numFriends+1;
        for(int i=0 ; i<word.length() ; i++){
            String st = word.substring(i,Math.min(i+len,word.length()));
            if(st.compareTo(str)>0){
                str = st;
            }
        }
        return str.toString();
    }
}