// Last updated: 8/2/2025, 11:32:06 PM
class Solution {
    public int maximumGain(String s, int x, int y) {
        char ch1='a',ch2='b';
        int c1=0,c2=0;
        int ans=0;
        if(x<y){
            int temp = x;
            x=y;
            y=temp;
            ch1='b';
            ch2='a';
        }
        for(char ch : s.toCharArray()){
            if(ch==ch1) c1++;
            else if(ch==ch2){
                if(c1>0){
                    c1--;
                    ans += x;
                }else{
                    c2++;
                }
            }else{
                ans += Math.min(c1,c2)*y;
                c1=0;
                c2=0;
            }
        }
        ans += Math.min(c1,c2)*y;
        return ans;
    }
}