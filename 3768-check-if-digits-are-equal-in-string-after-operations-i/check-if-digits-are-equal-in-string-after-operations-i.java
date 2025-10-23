class Solution {
    public boolean hasSameDigits(String s) {
        if(s.length()<2) return false;
        int n = s.length();
        while(n>2){
            StringBuilder st = new StringBuilder();
            for(int i=0 ;i<n-1 ; i++){
                int x = (s.charAt(i)+s.charAt(i+1)-'0'-'0')%10;
                st.append(x);
            }
            s = st.toString();
            n--;
        }
        return s.charAt(0)==s.charAt(1);
    }
}