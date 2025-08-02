// Last updated: 8/2/2025, 11:28:58 PM
class Solution {
    public String findValidPair(String s) {
        int[] fre = new int[9];
        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            fre[s.charAt(i)-'1']++;
        }
        for(int i=0 ; i<fre.length ; i++){
            if(i+1 == fre[i]){
                ans.append((i+1)+"");
            }
        }
        for(int i=0 ; i<s.length()-1 ; i++){
            char ch = s.charAt(i);
            char cha = s.charAt(i+1);
            if(ch!=cha && ans.toString().contains(ch+"") && ans.toString().contains(cha+"")){
                return ""+ch+cha;
            }
        }
        return "";
    }
}