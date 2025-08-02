// Last updated: 8/2/2025, 11:32:52 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int a=0,b=0,c=0,i=0;
        for(i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                a++;
            }else if(s.charAt(i)=='b'){
                b++;
            }else{
                c++;
            }
            if(a>=1 && b>=1 && c>=1){
                break;
            }
        }
        int start=0;
        int count=(n-i);
        while(i+1<n && start<s.length()){
            //shrink
            while(a>=1 && b>=1 && c>=1){
                if(s.charAt(start)=='a'){
                    a--;
                }else if(s.charAt(start)=='b'){
                    b--;
                }else{
                    c--;
                }
                start++;
                if(a>=1 && b>=1 && c>=1){
                    count += (n-i);
                }
            }
            i++;
            if(s.charAt(i)=='a'){
                a++;
            }else if(s.charAt(i)=='b'){
                b++;
            }else{
                c++;
            }
            if(a>=1 && b>=1 && c>=1){
                count += (n-i);
            }
        }
        while(a>=1 && b>=1 && c>=1 && start<s.length()){
            if(s.charAt(start)=='a'){
                a--;
            }else if(s.charAt(start)=='b'){
                b--;
            }else{
                c--;
            }
            start++;
            if(a>=1 && b>=1 && c>=1){
                count += (n-i);
            }
        }
        return count;
    }
}