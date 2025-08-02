// Last updated: 8/2/2025, 11:29:08 PM
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        int max = 0;
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=0 ; i<responses.size() ; i++){
            HashSet<String> unique = new HashSet<>();
            for(int j=0 ; j<responses.get(i).size() ; j++)
                unique.add(responses.get(i).get(j));
            for(String s : unique){
                map.put(s,map.getOrDefault(s,0)+1);
                max = Math.max(max,map.get(s));
            }
        }
        
        String out = "..";
        for(String s : map.keySet()){
            if(map.get(s)==max){
                if(out.compareTo("..")==0)out = s;
                else out = (out.compareTo(s)<0 ? out : s);
            }
        }
        return out;
    }
}