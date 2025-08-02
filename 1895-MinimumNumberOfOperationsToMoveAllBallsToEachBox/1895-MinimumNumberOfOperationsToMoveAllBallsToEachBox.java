// Last updated: 8/2/2025, 11:31:56 PM
class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i=0 ; i<boxes.length() ; i++){
            if(boxes.charAt(i)=='1'){
                for(int j=0 ; j<boxes.length(); j++){
                    ans[j] += Math.abs(i-j);
                }
            }
        }
        return ans;
    }
}