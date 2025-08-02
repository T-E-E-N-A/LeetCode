// Last updated: 8/2/2025, 11:29:35 PM
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start=0,c=0,ans=0;
        for(int i=start+1; start<colors.length ; i++){
            if(colors[i%colors.length]!=colors[(i-1)%colors.length]){
                c++;
            }else{
                c=0;
                start=i;
            }
            if(c==k-1){
                ans++;
                start++;
                c--;
            }
        }
        return ans;
        
    }
}