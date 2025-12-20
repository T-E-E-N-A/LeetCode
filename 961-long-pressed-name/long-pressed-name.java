class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()) return false;
        int j=0;
        for(int i=0 ; i<name.length() ; i++){
            if(j>=typed.length()) return false;
            if(typed.charAt(j)==name.charAt(i)){
                j++;
            }else if(i>0 && typed.charAt(j)==name.charAt(i-1)){
                i--;j++;
            }else{
                return false;
            }
        }
        while(j<typed.length()){
            if(typed.charAt(j)!=name.charAt(name.length()-1)) return false;
            j++;
        }
        return true;
    }
}