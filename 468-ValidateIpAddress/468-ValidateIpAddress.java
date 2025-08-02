// Last updated: 8/2/2025, 11:35:08 PM
class Solution {
    public String validIPAddress(String queryIP) {
        if(queryIP.length()<7 || queryIP.charAt(queryIP.length()-1)==':' || queryIP.charAt(queryIP.length()-1)=='.'){
            return "Neither";
        }
        String[] arr = queryIP.split("[:]");
        if(isipv4(queryIP)){
            return "IPv4";
        }
        if(arr.length==8){
            for(int i=0 ; i<8 ; i++){
                if(arr[i].length()==0){
                    return "Neither";
                }
                for(int j=0 ; j<arr[i].length() ; j++){
                    if(j>3){
                        return "Neither";
                    }
                    if(!(arr[i].charAt(j)-'0'>=0 && arr[i].charAt(j)-'0'<=9)  && (!(arr[i].charAt(j)-'a'<=5 && arr[i].charAt(j)-'a'>=0) && !(arr[i].charAt(j)-'A'<=5 && arr[i].charAt(j)-'A'>=0))){
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
    public boolean isipv4(String queryIP){
        String[] arr = queryIP.split("[.]");
        if(queryIP.charAt(queryIP.length()-1)=='.' || queryIP.charAt(0)=='.' || arr.length!=4){
            return false;
        }
        for(int i=0 ; i<4 ; i++){
            if(arr[i].length()<1){
                return false;
            }
            if(arr[i].charAt(0)=='0' && arr[i].length()>1){
                return false;
            }
            try{
                int a = Integer.parseInt(arr[i]);
                if(a>255 || a<0){
                    return false;
                }
            }catch(NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}
