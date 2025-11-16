class Solution {
    public int numSub(String s) {
        long cnt=1,ans=0;
        int mod = 1000000007;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='1'){
                ans = (ans + cnt)%mod;
                cnt++;
            }else{
                cnt=1;
            }
        }
        return (int)ans%mod;
    }
}