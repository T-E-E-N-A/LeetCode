// Last updated: 8/2/2025, 11:28:24 PM
class Solution {
    public String concatHex36(int n) {
        int[] hex = new int[100];
        int[] hextri = new int[100];
        int copy = n*n;
        int i=0,j=0;
        while(copy>0){
            hex[i] = copy%16;
            copy/=16;
            i++;
        }
        copy=n*n*n;
        while(copy>0){
            hextri[j] = copy%36; copy /= 36; j++;
        }
        StringBuilder str = new StringBuilder();
        for(int k=i-1 ; k>=0 ; k--){
            if(hex[k]>9) str.append((char)(55+hex[k]));
            else str.append(hex[k]);
        }
        for(int k=j-1 ; k>=0 ; k--){
            if(hextri[k]>9) str.append((char)(55+hextri[k]));
            else str.append(hextri[k]);
        }
        return str.toString();
    }
}