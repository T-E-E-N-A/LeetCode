// Last updated: 8/2/2025, 11:32:16 PM
class Solution {
    public int minFlips(String target) {
        char a = '1';
        int ans=0;
        for(int i=0 ;i<target.length() ; i++){
            if(target.charAt(i)==a){
                ans++;
                if(a=='1')a ='0';
                else a='1';
            }
        }
        return ans;
    }
}