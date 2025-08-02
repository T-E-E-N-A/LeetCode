// Last updated: 8/2/2025, 11:57:45 PM
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0) return 0;
        int i=0;
        long ans=0;
        boolean minus = false;
        if(s.charAt(0)=='+') i++;
        else if(s.charAt(0)=='-'){
            i++;
            minus = true;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            ans = ans*10+(s.charAt(i)-'0');
            if(ans>Integer.MAX_VALUE && !minus) return Integer.MAX_VALUE;
            else if(minus && ans*-1<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        if(minus) ans = ans*-1;
        return (int)ans;
    }
}