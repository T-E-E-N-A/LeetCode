// Last updated: 8/2/2025, 11:57:32 PM
class Solution {
    static String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        ans(digits,"",res);
        return res;
    }
    public static void ans(String s ,String answer , List<String> res){
        if(s.length()==0){
            // System.out.print(answer+" ");
            res.add(answer);
            return;
        }
        String str1 = key[s.charAt(0)-'0'];
        for(int i=0 ; i<str1.length() ; i++){
            ans(s.substring(1),answer+str1.charAt(i),res);
        }
    }
}