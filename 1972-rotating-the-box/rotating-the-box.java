class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        for(int i=0 ; i<boxGrid.length ; i++){
            int c=0;
            for(int j=0 ; j<boxGrid[0].length ; j++){
                if(boxGrid[i][j]=='#'){
                    c++;
                    boxGrid[i][j]='.';
                }
                if(boxGrid[i][j]=='*'){
                    fillBoxes(boxGrid,c,i,j);
                    c=0;
                }
            }
            fillBoxes(boxGrid,c,i,boxGrid[0].length);
        }
        char[][] ans = new char[boxGrid[0].length][boxGrid.length];
        for(int i=boxGrid.length-1 ; i>=0 ; i--){
            for(int j=0 ; j<boxGrid[0].length ; j++){
                ans[j][i]= boxGrid[boxGrid.length-1-i][j];
            }
        }
        return ans;
    }
    public void fillBoxes(char[][] boxGrid, int c, int i, int j){
        for(int k=j-1 ; k>j-1-c ; k--){
            boxGrid[i][k]='#';
        }

    }
}