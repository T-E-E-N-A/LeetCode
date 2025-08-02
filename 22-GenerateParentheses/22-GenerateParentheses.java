// Last updated: 8/2/2025, 11:57:23 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(n,"",0,0,res);
        return res;
    }
    public static void generate(int n,String ans,int open,int close,List<String> res) {
        if(close>open){
            return;
        }
        if(open==n && close==n){
            res.add(ans);
            return;
        }
        if(open<n){
            generate(n,ans+"(",open+1,close,res);
        }
        if(close+1<=open){
            generate(n,ans+")",open,close+1,res);
        }
    }
}