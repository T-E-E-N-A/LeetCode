// Last updated: 8/2/2025, 11:33:17 PM
class Solution {
    public String alphabetBoardPath(String target) {
        String[] s = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
        // ejoty
        StringBuilder str = new StringBuilder();
        int n=5;
        int oldp = 0,oldc=0;
        for(int i=0 ; i<target.length();i++){
            char word = target.charAt(i);
            if(i!=0){
                if(target.charAt(i-1)==target.charAt(i)){
                    str.append('!');
                    continue;
                }
            }
            int row = (word-'a')/n;
            int col = (word-'a')%n;
            if(i!=0 && word=='z'){
                row--;
            }
            if(i!=0){
                for(int j=0 ; j<Math.abs(oldp-row) ; j++){
                    if(target.charAt(i-1)<word){
                        str.append('D');
                    }else{
                        str.append('U');
                    }
                }
                for(int j=0 ; j<Math.abs(oldc-col) ; j++){
                    if(oldc<col){
                        str.append('R');
                    }else{
                        str.append('L');
                    }
                }
                if(word=='z'){
                    str.append('D');
                    row++;
                }
                str.append('!');
                oldp = row;
                oldc = col;
            }else{
                for(int j=0 ; j<row ; j++){
                    str.append('D');
                }
                for(int j=0 ; j<col ; j++){
                    str.append('R');
                }
                str.append('!');
                oldp = row;
                oldc = col;
            }
        }
        return str.toString();
    }
}