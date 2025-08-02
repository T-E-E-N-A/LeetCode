// Last updated: 8/2/2025, 11:57:52 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }else if(s.length()==1){
            return 1;
        }
        int start=0,end=0,len=0;
        for(int i=1 ; i<s.length() ; i++){
            int x = check(s,start,i);
            if(x!=-1){
                start=x+1;
            }
            end++;
            len = Math.max(len,(end-start+1));
        }
        return len;
    }
    public int check(String s,int i,int j){
        for(; i<j ; i++){
            if(s.charAt(j)==s.charAt(i)){
                // System.out.println("yes");
                return i;
            }
        }
        return -1;
    }
}