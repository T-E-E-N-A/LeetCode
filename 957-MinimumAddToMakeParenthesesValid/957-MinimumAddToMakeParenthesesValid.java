// Last updated: 8/2/2025, 11:33:48 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,ans=0;
        for(int i=0 ; i<s.length() ; i++){
            char a = s.charAt(i);
            if(a==')' && open==0){
                ans++;
            }else if(a==')'){
                open--;
            }else{
                open++;
            }
        }
        return open+ans;
    }
}