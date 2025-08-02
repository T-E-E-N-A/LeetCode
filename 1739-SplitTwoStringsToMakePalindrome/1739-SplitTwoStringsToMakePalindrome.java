// Last updated: 8/2/2025, 11:32:09 PM
class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        int start=0,end=a.length()-1;
        while(start<end){
            if(a.charAt(start)!=b.charAt(end)){
                break;
            }
                start++;
                end--;
        }
        if(start>=end){
            return true;
        }
        String confuse = a.substring(start,end+1);
        if(isPalindrome(confuse)){
            return true;
        }
        confuse = b.substring(start,end+1);
        if(isPalindrome(confuse)){
            return true;
        }
        start=0;end=a.length()-1;
        while(start<end){
            if(b.charAt(start)!=a.charAt(end)){
                break;
            }
            start++;
            end--;
        }
        confuse = b.substring(start,end+1);
        if(isPalindrome(confuse)){
            return true;
        }
        confuse = a.substring(start,end+1);
        if(isPalindrome(confuse)){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String confuse){
        int start=0,end=confuse.length()-1;
        while(start<end){
            if(confuse.charAt(start)!=confuse.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}