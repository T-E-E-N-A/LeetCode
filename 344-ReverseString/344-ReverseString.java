// Last updated: 8/2/2025, 11:35:53 PM
class Solution {
    public void reverseString(char[] s) {
        int start=0,end = s.length-1;
        while(start<end){
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;end--;
        }
        // return s;
    }
}