// Last updated: 8/2/2025, 11:29:29 PM
class Solution {
    public char kthCharacter(int k) {
        int[] arr = {2,4,8,16,32,64,128,256,512};
        int c=0,i=0;
        for(i=0 ; i<arr.length-1 ; i++){
            if(k<arr[i]){
                break;
            }
        }
        if(i==0) return 'a';
        while(i>0 && k>1){
            if(k<arr[i-1]){
                i--;
                continue;
            }
            if(k%arr[i-1]==0){
                c += i;
                break;
            }
            k = k%arr[i-1];
            c++;
            i--;
        }
        return (char)('a'+c);
    }
}