// Last updated: 8/2/2025, 11:28:54 PM
class Solution {
    public int maxDifference(String s) {
        int[] fre = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            fre[s.charAt(i)-'a']++;
        }
        int odd=0,even=Integer.MAX_VALUE;
        for(int i=0 ; i<s.length() ; i++){
            if(fre[s.charAt(i)-'a']%2==1){
                odd = Math.max(odd,fre[s.charAt(i)-'a']);
            }else{
                even = Math.min(even,fre[s.charAt(i)-'a']);
            }
        }
        return odd-even;
    }
}