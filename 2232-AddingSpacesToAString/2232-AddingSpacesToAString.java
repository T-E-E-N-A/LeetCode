// Last updated: 8/2/2025, 11:31:23 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder si = new StringBuilder();
        int j=0;
        for(int i=0 ; i<s.length() ; i++){
            if(j<spaces.length && i==spaces[j]){
                si.append(" ");
                j++;
            }
            si.append(s.charAt(i));
        }
        return si.toString();
    }
}