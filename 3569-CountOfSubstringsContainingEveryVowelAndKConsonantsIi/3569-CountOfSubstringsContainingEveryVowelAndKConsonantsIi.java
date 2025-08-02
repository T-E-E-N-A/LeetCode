// Last updated: 8/2/2025, 11:29:30 PM
class Solution {
    public long countOfSubstrings(String word, int k) {
        return ans(word,k)-ans(word,k+1);
    }
    public long ans(String word,int k){
        int[] fre = new int[6];
        int i=0,start=0;
        long c=0;
        for(i=0;i<word.length();i++){
            freq(word,i,fre);
            while(fre[5]>=k && isAllVowel(fre)){
                c += (word.length() - i);
                decFre(word,start,fre);
                start++;
            }
        }
        return c;
    }
    public void freq(String word,int i,int[] fre){
        if(word.charAt(i)=='a'){
                fre[0]++;
            }else if(word.charAt(i)=='e'){
                fre[1]++;
            }else if(word.charAt(i)=='i'){
                fre[2]++;
            }else if(word.charAt(i)=='o'){
                fre[3]++;
            }else if(word.charAt(i)=='u'){
                fre[4]++;
            }else{
                fre[5]++;
            }
    }
    public boolean isAllVowel(int[] fre){
        if(fre[0]>0 && fre[1]>0 && fre[2]>0 && fre[3]>0 && fre[4]>0){
            return true;
        }
        return false;
    }
    public void decFre(String word,int start,int[] fre){
        if(word.charAt(start)=='a'){
            fre[0]--;
        }else if(word.charAt(start)=='e'){
            fre[1]--;
        }else if(word.charAt(start)=='i'){
            fre[2]--;
        }else if(word.charAt(start)=='o'){
            fre[3]--;
        }else if(word.charAt(start)=='u'){
            fre[4]--;
        }else{
            fre[5]--;
        }
    }
}