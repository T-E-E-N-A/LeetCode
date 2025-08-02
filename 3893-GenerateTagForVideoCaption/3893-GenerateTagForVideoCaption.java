// Last updated: 8/2/2025, 11:28:22 PM
class Solution {
    public String generateTag(String caption) {
        StringBuilder s = new StringBuilder();
        s.append("#");
        boolean space=false;
        int i=0;
        while(i<caption.length() && caption.charAt(i)==' '){
            i++;
        }
        for(;i<caption.length() && s.length()<100 ; i++){
            char ch = caption.charAt(i);
            if(ch==' '){
                space = true;
            }
            if(!Character.isLetter(ch)) continue;
            if(space){
                if(Character.isUpperCase(ch)) s.append(ch);
                else s.append((char)(ch-32));
                space = false;
            }else if(Character.isUpperCase(ch)){
               s.append((char)(ch+32)); 
            }else{
                s.append(ch);
            }
        }
        return s.toString();
    }
}