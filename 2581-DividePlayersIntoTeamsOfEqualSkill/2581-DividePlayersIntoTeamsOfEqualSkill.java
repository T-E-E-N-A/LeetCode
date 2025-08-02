// Last updated: 8/2/2025, 11:30:38 PM
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start=0,end=skill.length-1;
        int sum=skill[start]+skill[end];
        long ans=0;
        while(start<end){
            if(sum!=skill[start]+skill[end]){
                return -1;
            }
            ans += skill[start++]*skill[end--];
        }
        return ans;
    }
}