// Last updated: 8/2/2025, 11:30:05 PM
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int flag = 1;
        if(groups[0]==0) flag=0;
        for(int i=0 ; i<groups.length ; i++){
            if(groups[i]==flag){
                ans.add(words[i]);
                if(flag==0) flag=1;
                else flag=0;
            }
        }
        return ans;
    }
}