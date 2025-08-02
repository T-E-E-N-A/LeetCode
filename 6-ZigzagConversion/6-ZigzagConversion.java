// Last updated: 8/2/2025, 11:57:48 PM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        char[][] arr = new char[numRows][s.length()];
        int c= s.length();
        int j=0;
        int col=0;
        arr[0][0] = s.charAt(0);
        c--;
        j=1;
        while(c>0){
            for(int i=1 ;c>0 && i<numRows; i++){
                arr[i][col] = s.charAt(j);
                c--;
                j++;
            }
            col++;
            for(int row = numRows-2 ;c>0 && row>=0; row--){
                arr[row][col] = s.charAt(j);
                j++;
                c--;
                col++;
            }
            col--;
        }
        c = s.length();
        StringBuilder si = new StringBuilder();
        for(int i=0 ; i<arr.length ;i++){
            for(int k=0 ; k<arr[0].length ; k++){
                if(arr[i][k]!='\0')
                    si.append(arr[i][k]);
            }
        }
        return si.toString();
    }
}