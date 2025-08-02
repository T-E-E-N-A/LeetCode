// Last updated: 8/2/2025, 11:31:58 PM
class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0 ; i<s.length() ; i++){
            int[] arr = new int[26];
            for(int j=i ; j<s.length() ; j++){
                arr[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int fre : arr){
                    max = Math.max(max,fre);
                    if(fre!=0) min = Math.min(min,fre);
                }
                ans += max-min;
            }
        }
        return ans;
    }
}