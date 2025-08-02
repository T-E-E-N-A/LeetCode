// Last updated: 8/2/2025, 11:32:31 PM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int j=1;
        while(target[0]>j++){
            ans.add("Push");
            ans.add("Pop");
        }
        for(int i=0 ;i<target.length-1 ; i++){
            ans.add("Push");
            j=0;
            while(target[i+1]-target[i]-1>j++){
                ans.add("Push");
                ans.add("Pop");
            }
        }
        ans.add("Push");
        return ans;
    }
}