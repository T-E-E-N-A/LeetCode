class Solution {
    public String largestGoodInteger(String num) {
        String ans = "0";
        for(int i=2 ;  i<num.length() ; i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i-2)==num.charAt(i-1)){
                if(ans.charAt(0)<=num.charAt(i)){
                    ans = num.substring(i-2,i+1);
                }
            }
        }
        if(ans.length()<2) return "";
        return ans;
    }
}