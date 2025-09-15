class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        HashSet<Character> set = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()) set.add(ch);
        int c=0;
        for(String s : arr){
            boolean flag = true;
            for(char ch : s.toCharArray()){
                if(set.contains(ch)){
                    flag = false;
                    break;
                }
            }
            if(flag) c++;
        }
        return c;
    }
}