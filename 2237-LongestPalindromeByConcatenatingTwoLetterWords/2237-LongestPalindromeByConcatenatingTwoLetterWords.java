// Last updated: 8/2/2025, 11:31:21 PM
class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String , Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0 ; i<words.length ; i++){
            StringBuilder str = new StringBuilder(words[i]).reverse();
            if(map.getOrDefault(str.toString(),0)>0){
                ans += 4;
                map.put(str.toString(),map.get(str.toString())-1);
            }else map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(String s : map.keySet()){
            if(s.charAt(0)==s.charAt(1) && map.getOrDefault(s,0)>0){
                ans += 2;
                break;
            }
        }
        return ans;
    }
}