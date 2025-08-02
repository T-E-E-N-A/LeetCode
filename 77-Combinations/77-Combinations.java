// Last updated: 8/2/2025, 11:56:22 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> li = new ArrayList<>();
        answer(n,k,li , new ArrayList<>() , 1);
        return li;
    }
    public void answer(int n, int k, List<List<Integer>> li , List<Integer> ans , int ind){
        if(ans.size()==k){
            li.add(new ArrayList(ans));
            return;
        }
        for(int i=ind ; i<=n ; i++){
            ans.add(i);
            answer(n,k,li,ans,i+1);
            ans.remove(ans.size()-1);
        }
    }
}