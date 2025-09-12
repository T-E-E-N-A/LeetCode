class Solution {
    public boolean doesAliceWin(String s) {
        int vow = 0;
        HashSet<Character> set = new HashSet<>();
        set.addAll(Arrays.asList('a','e','i','o','u'));
        int c=0;
        for(int i=0 ; i<s.length() ; i++){
            if(set.contains(s.charAt(i))){
                c++;
            }
        }
        if(c==0) return false;
        return true;
    }
}