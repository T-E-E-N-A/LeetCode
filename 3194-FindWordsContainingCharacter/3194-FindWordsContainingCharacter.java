// Last updated: 8/2/2025, 11:29:58 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<>();
        for(int i=0 ; i<words.length ; i++){
            if(words[i].indexOf(x)!=-1){
                li.add(i);
            }
        }
        return li;
    }
}