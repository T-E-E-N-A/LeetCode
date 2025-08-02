// Last updated: 8/2/2025, 11:28:28 PM
class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int[] count = new int[26];
        int i=0;
        for(char a : map.keySet()){
            count[i++] = map.get(a);
        }
        int ans=0;
        Arrays.sort(count);
        for(i=0 ; i<count.length-k;){
            ans += count[i++];
        }
        return ans;
    }
}