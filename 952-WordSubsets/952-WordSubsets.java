// Last updated: 8/2/2025, 11:33:52 PM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int k=0,j=0,i=0;
        List<String> ans = new ArrayList<>();
            int[] count = new int[26];
            int[] freq = new int[26];
            for(j=0 ; j<words2.length ; j++){
                Arrays.fill(count,0);
                for(i=0 ; i<words2[j].length() ; i++){
                    count[words2[j].charAt(i)-'a']++;
                }
                for(i=0 ; i<26 ; i++){
                    freq[i] = Math.max(freq[i],count[i]);
                }
            }
            for(i=0 ; i<words1.length ;i++){
                Arrays.fill(count,0);
                for(j=0 ; j<words1[i].length();j++){
                    count[words1[i].charAt(j)-'a']++;
                }
                for(j=0 ; j<26 ; j++){
                    if(count[j]<freq[j]){
                        break;
                    }
                }
                if(j==26){
                    ans.add(words1[i]);
                }
            }
        return ans;
    }
}