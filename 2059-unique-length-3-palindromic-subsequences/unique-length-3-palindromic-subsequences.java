class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans=0;
        int end=s.length()-1;
        HashSet<Integer> vis = new HashSet<>();
        for(int st=0 ; st<s.length() ;){
            if(vis.contains(s.charAt(st)-'a')){
                st++;
                continue;
            }
            if(s.charAt(st)==s.charAt(end)){
                ans += countUnique(s,st,end);
                vis.add(s.charAt(st)-'a');
                st++;
                end = s.length()-1;
            }else{
                end--;
            }
        }
        return ans;
    }
    public int countUnique(String s, int st, int end){
        HashSet<Integer> set = new HashSet<>();
        for(int i=st+1 ; i<end ; i++){
            set.add(s.charAt(i)-'a');
        }
        return set.size();
    }
}