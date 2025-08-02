// Last updated: 8/2/2025, 11:29:45 PM
import java.lang.Math;
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0 ; i<s.length()-1 ; i++){
            sum+= Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}