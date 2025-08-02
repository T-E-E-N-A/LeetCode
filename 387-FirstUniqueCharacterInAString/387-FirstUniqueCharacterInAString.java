// Last updated: 8/2/2025, 11:35:40 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(int i=0 ;  i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        String str ="";
        for(int j=0 ; j<s.length() ; j++){
            if(arr[s.charAt(j)-'a']==1){
                return j;
            }
        }
        return -1;
    }
}