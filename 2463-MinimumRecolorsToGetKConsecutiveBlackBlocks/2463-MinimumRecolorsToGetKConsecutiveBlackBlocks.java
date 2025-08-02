// Last updated: 8/2/2025, 11:30:54 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        // counting black fom index 0-(k-1) -> intitial as then we'll increase by 1
        int c=0, ans = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                c++;
            }
        }
        ans = Math.min(ans,c);
        for(int i=k;i<blocks.length();i++){
            // grow
            if(blocks.charAt(i)=='W'){
                c++;
            }
            // shrink
            if(blocks.charAt(i-k)=='W'){
                c--;
            }
            // answer Update
            ans = Math.min(ans,c);
        }
        return ans;
    }
}