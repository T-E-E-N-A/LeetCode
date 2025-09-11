class Solution {
    public String sortVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        Collections.addAll(set, 'a','e','i','o','u','A','E','I','O','U');
        ArrayList<Character> lis = new ArrayList<>();
        for(int i=0 ; i<s.length() ; i++){
            if(set.contains(s.charAt(i))){
                lis.add(s.charAt(i));
            }
        }
        Collections.sort(lis);
        StringBuilder ans = new StringBuilder();
        int j=0;
        for(int i=0 ; i<s.length() ; i++){
            if(set.contains(s.charAt(i))){
                ans.append(lis.get(j++));
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}