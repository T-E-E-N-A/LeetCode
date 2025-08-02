// Last updated: 8/2/2025, 11:35:22 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()) return ans;
        int[] frep = new int[26];
        int[] fres = new int[26];
        for(int i=0 ; i<p.length() ; i++){
            frep[p.charAt(i)-'a']++;
            fres[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(frep,fres)){
            ans.add(0);
        }
        int start=0,end= p.length();
        while(end<s.length()){
            fres[s.charAt(start)-'a']--;
            fres[s.charAt(end)-'a']++;
            start++;end++;
            if(Arrays.equals(frep,fres)){
                ans.add(start);
            }
        }
        return ans;
    }
}