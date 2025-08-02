// Last updated: 8/2/2025, 11:36:25 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> li = new ArrayList<>();
        answer(n,k,new ArrayList<>(), li,1);
        return li;
    }
    public void answer(int target,int k , List<Integer> ans , List<List<Integer>> li, int ind){
        if(k==0){
            if(target==0){
                li.add(new ArrayList<>(ans));
            }
                return;
        }
        for(int i=ind ; i<=9 ; i++){
            if(target-i<0){
                continue;
            }
            if(i<=target){
                ans.add(i);
                answer(target-i,k-1,ans,li,i+1);
                ans.remove(ans.size()-1);
            }
        }
    }
}