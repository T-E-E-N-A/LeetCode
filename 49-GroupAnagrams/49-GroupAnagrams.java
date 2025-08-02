// Last updated: 8/2/2025, 11:56:49 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();
        for(int i=0 ; i<strs.length ; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s)){
                List<String> lis = new ArrayList<>(map.get(s));
                lis.add(strs[i]);
                map.put(s , lis);
            }else{
                List<String> lis = new ArrayList<>();
                lis.add(strs[i]);
                map.put(s,lis);
            }
        }
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}