// Last updated: 8/2/2025, 11:29:40 PM
class Solution {
    public String clearDigits(String s) {
        StringBuilder si = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                si.deleteCharAt(si.length()-1);
            }else{
                si.append(s.charAt(i));
            }
        }
        return si.toString();
    }
}