// Last updated: 8/2/2025, 11:34:39 PM
class Solution {
    public int countSubstrings(String s) {
        int len = 0;
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i+1 ;j<=s.length() ; j++){
                if(isPalindrome(s.substring(i,j))){
                    len++;
                }
            }
        }
        return len;
    }
    public boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}