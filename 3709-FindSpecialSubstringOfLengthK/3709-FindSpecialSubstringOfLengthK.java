// Last updated: 8/2/2025, 11:29:04 PM
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if(s.length()==k){
            if(k==1){
                return true;
            }
            for(int i=0 ; i<k-1 ; i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    return false;
                }
            }
            return true;
        }
        int c=0;
        int start=0,end=k;
        while(end<=s.length()){
            boolean flag=false;
            for(int i=start; i<end-1 ; i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    start++;end++;
                    flag=true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            // System.out.println(start + " "+ end);
            if(start-1>=0 && s.charAt(start)==s.charAt(start-1)){
                start++;end++;
                continue;
            }else if(end<s.length() && s.charAt(end)==s.charAt(end-1)){
                start++;end++;
                continue;
            }else{
                return true;
            }
        }
        return false;
    }
}