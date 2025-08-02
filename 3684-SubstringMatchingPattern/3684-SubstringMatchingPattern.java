// Last updated: 8/2/2025, 11:29:12 PM
class Solution {
    public boolean hasMatch(String s, String p) {
        int mid = 0;
        if(p.length()==1){
            return true;
        }
        for(int i=0 ;i<p.length() ;i++){
            if(p.charAt(i)=='*'){
                mid=i;
            }
        }
        String s1="";
        String s2="";
        int ind2 = -1;
        int ind1 = -1;
        if(mid==0){
            s2 = p.substring(1);
            ind2 = s.indexOf(s2);
            if(ind2!=-1){
                return true;
            }
        }else if(mid==p.length()-1){
            s1 = p.substring(0,p.length()-1);
            ind1 = s.indexOf(s1);
            if(ind1!=-1){
                return true;
            }
        }
        s1 = p.substring(0,mid);
        s2 = p.substring(mid+1);
        ind1 = s.indexOf(s1);
        ind2 = s.substring(ind1+s1.length()).indexOf(s2);
        System.out.println(ind1 + " "+ ind2);
        if(ind1 != -1 && ind2 !=-1 && ind1 < ind2+ind1+s1.length()){
            return true;
        }
        return false;
    }
}