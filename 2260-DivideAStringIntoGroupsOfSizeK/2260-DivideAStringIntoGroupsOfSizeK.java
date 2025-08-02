// Last updated: 8/2/2025, 11:31:18 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size=s.length()/k;
        if(s.length()%k!=0) size++;
        String[] ans = new String[size];
        int i=0;
        for(i=0 ; i+k<size*k ; i+=k){
            ans[i/k] = s.substring(i,i+k);
        }
        if(i<s.length() && (i/k)<size){
            int x=0;
            String ss = new String();
            while(s.substring(i).length()+x<k){
                ss += fill;
                x++;
            }
            ans[i/k] = s.substring(i)+ss;
        }
        return ans;
    }
}