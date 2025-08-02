// Last updated: 8/2/2025, 11:55:57 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ; i<numRows ; i++){
            List<Integer> lis = new ArrayList<>();
            lis.add(1);
            for(int j=1 ; j<i ; j++){
                lis.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            if(i!=0) lis.add(1);
            ans.add(lis);
        }
        return ans;
    }
}