// Last updated: 8/2/2025, 11:29:49 PM
class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ;i<word.length() ; i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        int ans=100000;
        for(int i : map.values()){
            int temp=0;
            for(int j : map.values()){
                if(j<i){
                    temp += j;
                }else if(j>(i+k)){
                    temp += (j-i-k);
                }
            }
            ans = Math.min(temp,ans);
        }
        return ans;
    }
}