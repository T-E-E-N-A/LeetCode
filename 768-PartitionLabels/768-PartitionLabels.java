// Last updated: 8/2/2025, 11:34:24 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> lis = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ;i<s.length() ;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        HashSet<Character> set = new HashSet<>();
        int start=0;
        for(int i=0 ;i<s.length() ; i++){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            set.add(s.charAt(i));
            if(map.getOrDefault(s.charAt(i),0)==0){
                set.remove(s.charAt(i));
            }
            if(set.size()==0){
                lis.add(i-start+1);
                start=i+1;
            }
        }
        return lis;
    }
}