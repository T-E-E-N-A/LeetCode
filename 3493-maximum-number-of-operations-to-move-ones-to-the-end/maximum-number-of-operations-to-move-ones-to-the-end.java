class Solution {
    public int maxOperations(String s) {
        int ans=0;
        int ele=0;
        boolean flag=false;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='0'){
                while((i+1)<s.length() && s.charAt(i+1)=='0'){
                    i++;
                }
                ans += ele;
            }else{
                ele++;
            }
        }
        return ans;
    }
}