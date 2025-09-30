class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans=0;
        int cnt=0;
        int i=0;
        int st=0;
        while(i<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);

            cnt = Math.max(cnt,map.get(s.charAt(i)));
            if(i-st+1 - cnt > k){
                map.put(s.charAt(st),map.get(s.charAt(st))-1);
                st++;
            }
            ans = Math.max(ans,i-st+1);
            i++;
        }
        return ans;
    }
}