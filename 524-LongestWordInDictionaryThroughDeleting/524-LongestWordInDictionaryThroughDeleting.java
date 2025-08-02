// Last updated: 8/2/2025, 11:34:58 PM
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        String ans= "";
        for(String str : dictionary){
            if(str.length()>s.length() || ans.length()>=str.length()){
                continue;
            }
            int pos=-1;
            for(int i=0 ; i<str.length() ; i++){
                pos = s.indexOf(str.charAt(i),pos+1);
                if(pos==-1){
                    break;
                }
            }
            if(pos!=-1){
                ans = str;
            }
        }
        return ans;
    }
}