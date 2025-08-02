// Last updated: 8/2/2025, 11:29:21 PM
class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int[] fr=new int[26];
        int mod=1000000007;
        for(char ch:s.toCharArray())
            fr[ch-'a']++;
        
        while(t-->0){
            int[] cnt=new int[26];
            cnt[0]=fr[25];
            cnt[1]=(fr[25]+fr[0])%mod;
            for(int i=2;i<26;i++)
                cnt[i]=fr[i-1];
            fr=cnt;
        }
        long ans=0;
        for(int i=0;i<26;i++){
            ans=(ans+fr[i])%mod;
        }
        return (int)ans;
    }
}