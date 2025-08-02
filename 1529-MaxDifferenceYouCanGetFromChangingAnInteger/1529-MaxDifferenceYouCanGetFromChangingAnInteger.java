// Last updated: 8/2/2025, 11:32:35 PM
class Solution {
    public int maxDiff(int num) {
        String s =  num+"";
        int i=0;
        while(i<s.length() && s.charAt(i)=='9') i++;
        char ch = '.';
        int min=0,max=0;
        char ch1 = s.charAt(0);
        if(i<s.length()) ch = s.charAt(i);
        else max=num;
        i=0;
        int val=1;
        while(i<s.length() && (ch1=='0' || ch1=='1')){
            ch1 = s.charAt(i++);
            val=0;
        }
        for(i=0; i<s.length() ; i++){
            if(ch!='.'){
                if(ch==s.charAt(i)){
                    max = max*10+9;
                }else{
                    max = max*10 + (s.charAt(i)-'0');
                }
            }

            if(ch1==s.charAt(i)){
                min = min*10 +val;
            }else{
                min = min*10 + (s.charAt(i)-'0');
            }
        }
        if(min==0){
            while(num>0){
                min =min*10 +1;
                num /=10;
            }
        }
        return max-min;
    }
}