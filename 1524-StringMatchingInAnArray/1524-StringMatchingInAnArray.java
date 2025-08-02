// Last updated: 8/2/2025, 11:32:37 PM
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li = new ArrayList<>();
        for(int i=0 ; i<words.length ;i++){
            for(int j=0 ; j<words.length ; j++){
                if(j!=i && words[i].length()<words[j].length() && words[j].contains(words[i])){
                    li.add(words[i]);
                    break;
                }
            }
        }
        return li;
    }
}