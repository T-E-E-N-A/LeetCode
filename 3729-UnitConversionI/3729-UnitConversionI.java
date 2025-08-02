// Last updated: 8/2/2025, 11:29:01 PM
class Solution {
    public int[] baseUnitConversions(int[][] conversions) {
        int[] out = new int[conversions.length+1];
        int mod = 1000000007;
        out[0]=1;
        for(int i=0 ; i<conversions.length ; i++){
            long mul = ((long)conversions[i][2]*out[conversions[i][0]])%mod;
            out[conversions[i][1]] = (int)mul;
        }
        return out;
    }
}