class Solution {
    static int mod = 1000000007;
    public int numberOfWays(String corridor) {
        int c=0,x=0,cnt=0;
        long ans=1;
        for(int i=0 ; i<corridor.length() ; i++){
            if(corridor.charAt(i)=='S'){
                cnt++;
                if(c==2){
                    if(x!=0) ans = (ans*(x+1)%mod)%mod;
                    x=0;
                    c=1;
                }else c++;
            }else if(c==2 && corridor.charAt(i)=='P') x++;
        }
        if(cnt%2==1 || cnt==0) return 0;
        return (int)ans;
    }
}