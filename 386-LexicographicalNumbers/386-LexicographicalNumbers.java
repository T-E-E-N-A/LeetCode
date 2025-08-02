// Last updated: 8/2/2025, 11:35:42 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        generate(n,0,res);
        return res;
    }
    public void generate(int n,int ans,List<Integer> res){
        if(ans<=n){
            if(ans!=0)
            res.add(ans);
        }else{
            return;
        }
        int i=0;
        if(ans==0){
            i=1;
        }
        for( ; i<=9 ; i++){
            generate(n, ans*10+i, res);
        }
    }
}