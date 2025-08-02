// Last updated: 8/2/2025, 11:28:19 PM
class Solution {
    public List<String> partitionString(String s) {
        List<String> lis = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        for(int i=0 ;i<s.length() ; i++){
            str.append(s.charAt(i));
            if(!set.contains(str.toString())){
                lis.add(str.toString());
                set.add(str.toString());
                str=new StringBuilder();
            }
        }
        if(str.length()!=0 && !set.contains(str.toString())) lis.add(str.toString());
        return lis;
    }
}