// Last updated: 8/2/2025, 11:29:38 PM
class Solution {
    public String compressedString(String word) {
            StringBuilder s = new StringBuilder();
            int c=1;
        for(int i=0 ; i<word.length()-1 ; i++){
            if(word.charAt(i)==word.charAt(i+1)){
                c++;
                if(c==9){
                    s.append(c);
                    s.append(word.charAt(i));
                    c=0;
                }
            }else if(c!=0){
                s.append(c);
                s.append(word.charAt(i));
                c=1;
            }else{
                c=1;
            }
        }
        if(c!=0){
            s.append(c);
            s.append(word.charAt(word.length()-1));
        }
        return s.toString();
    }
}