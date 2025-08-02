// Last updated: 8/2/2025, 11:34:42 PM
class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==1){
            return true;
        }
        long min=0,max=(long)Math.sqrt(c);
        while(min<=max){
            if((min*min + max*max)==c){
                return true;
            }
            if(min*min + max*max > c){
                max--;
            }else{
                min++;
            }
        }
        return false;
    }
}