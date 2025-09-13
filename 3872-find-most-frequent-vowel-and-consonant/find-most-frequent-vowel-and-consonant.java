class Solution {
    public int maxFreqSum(String s) {
        int[] ch = new int[26];
        int max=0,ma2=0;
        for(int i : s.toCharArray()){
            ch[i-'a']++;
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                max = Math.max(max,ch[i-'a']);
            }else{
                ma2 = Math.max(ma2,ch[i-'a']);
            }
        }
        return max+ma2;
    }
}
