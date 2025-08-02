// Last updated: 8/2/2025, 11:30:13 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans=derived[0];
        for(int i=0 ; i<derived.length ; i++){
            ans = ans^derived[i];
        }
        if(ans==derived[0]){
            return true;
        }
        return false;
    }
}