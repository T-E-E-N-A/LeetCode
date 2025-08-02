// Last updated: 8/2/2025, 11:33:32 PM
class Solution {
    public boolean isValid(String s) {
        while(s.contains("abc")){
            s=s.replaceAll("abc","");
        }
        return s.length()==0;
    }
}