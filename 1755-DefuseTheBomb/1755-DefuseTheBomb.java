// Last updated: 8/2/2025, 11:32:08 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        for(int i=0 ; i<code.length ; i++){
            int sum=0;
            if(k>0){
                for(int j=1 ; j<=k ; j++){
                    sum+=code[(i+j)%code.length];
                }
            }else if(k<0){
                for(int j=k ; j<0 ; j++){
                    sum+=code[(i+j+code.length)%code.length];
                }
            }
            arr[i] = sum;
        }
        return arr;
    }
} 