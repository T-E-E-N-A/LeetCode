// Last updated: 8/2/2025, 11:35:18 PM
class Solution {
    public int compress(char[] chars) {
        int c=0;
        if(chars.length==0){
            return 0;
        }
        if(chars.length==1){
            return 1;
        }
        char ele = chars[0];
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<chars.length; i++ ){
            System.out.println(str);
            if(ele==chars[i]){
                c++;
            }else{
                str.append(ele);
                if(c!=1){
                    str.append(c);
                }
                c=1;
                ele=chars[i];
            }
        }
        str.append(ele);
        if(c!=1){
            str.append(c);
        }
        int i=0;
        for(i=0 ; i<str.length(); i++){
            chars[i] = str.charAt(i);
        }
        return i;
    }
}