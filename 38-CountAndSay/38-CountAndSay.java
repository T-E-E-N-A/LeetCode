// Last updated: 8/2/2025, 11:57:03 PM
class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int i=1 ; i<n ; i++){
            ans = compresion(ans);
        }
        return ans;
    }
    public String compresion(String s){
        StringBuilder str = new StringBuilder();
        int count=1,i=0;
        for(i=1 ; i<s.length() ; i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                str.append(count);
                str.append(s.charAt(i-1));
                count=1;
            }
        }
        str.append(count);
        str.append(s.charAt(i-1));
        return str.toString();
    }
}