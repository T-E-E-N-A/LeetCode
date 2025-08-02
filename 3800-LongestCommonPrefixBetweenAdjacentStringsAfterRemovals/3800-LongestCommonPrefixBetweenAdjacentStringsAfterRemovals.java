// Last updated: 8/2/2025, 11:28:46 PM
class Solution {
    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int[] count = new int[n];
        int[] firstSum = new int[n];
        int[] lastSum = new int[n];
        int[] ans = new int[n];

        for(int i=0 ; i<n-1 ;i++) count[i] = countAns(words[i],words[i+1]);

        // first n eleements sum
        firstSum[0] = count[0];
        for(int i=1 ; i<n ; i++) firstSum[i] = Math.max(firstSum[i-1],count[i]);

        // last n elements sum
        lastSum[n-1]=count[n-1];
        for(int i=n-2 ;i>=0 ; i--) lastSum[i] = Math.max(lastSum[i+1],count[i]);

        // max of them
        for(int i=0; i<n ; i++){
            if(i==0 || i==1){
                if(i+1<n){
                    ans[i] = lastSum[i+1];
                    if(i==1) ans[i] = Math.max(ans[i],countAns(words[0],words[i+1]));
                }else ans[i]=0;
            }else if(i==n-1){
                if(i-2>=0) ans[i] = firstSum[i-2];
                else ans[i] = 0;
            }else{
                ans[i] = Math.max(firstSum[i-2],lastSum[i+1]);
                ans[i] = Math.max(ans[i],countAns(words[i-1],words[i+1]));
            }
        }
        return ans;
    }
    public int countAns(String s1 , String s2){
        int ans=0;
        for(int i=0 ;i<s1.length() && i<s2.length() ; i++){
            if(s1.charAt(i)==s2.charAt(i)){
                ans++;
            }else return ans;
        }
        return ans;
    }
}