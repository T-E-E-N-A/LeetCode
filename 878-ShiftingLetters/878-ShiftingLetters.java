// Last updated: 8/2/2025, 11:34:07 PM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder(s);
        int k=0;
        for(int i=shifts.length-1 ; i>=0 ; i--){
            k+=shifts[i];
            k %= 26;
            ans.setCharAt(i,(char)((ans.charAt(i)-'a'+k)%26 + 'a'));
        }
        return ans.toString();
    }
}