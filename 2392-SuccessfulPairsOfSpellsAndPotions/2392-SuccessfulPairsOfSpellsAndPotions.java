// Last updated: 8/2/2025, 11:31:02 PM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for(int i=0 ; i<spells.length ; i++){
            int left=0,right=potions.length-1;
            int answ=potions.length;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(spells[i]*(long)potions[mid]>=success){
                    answ = mid;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i] = potions.length-answ;
        }
        return ans;
    }
}