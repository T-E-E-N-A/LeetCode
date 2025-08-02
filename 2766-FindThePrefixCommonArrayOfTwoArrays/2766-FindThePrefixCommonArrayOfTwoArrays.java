// Last updated: 8/2/2025, 11:30:14 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] a1 = new int[50];
        int[] b1 = new int[50];
        int[] ans = new int[A.length];
        for(int i=0 ; i<A.length ; i++){
            a1[A[i]-1]++;
            b1[B[i]-1]++;

            for(int j=0 ; j<50 ; j++){
                if(a1[j]!=0){
                    ans[i]+= Math.min(a1[j],b1[j]);
                }
            }
        }
        return ans;
    }
}