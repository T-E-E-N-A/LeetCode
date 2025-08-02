// Last updated: 8/2/2025, 11:32:32 PM
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int size=0,m=0;
        for(int i=0 ; i<nums.size() ; i++){
            m = Math.max(m,nums.get(i).size());
            size += nums.get(i).size();
        }
        List<List<Integer>> dummy = new ArrayList<>();
        for(int i=0 ; i<nums.size() ; i++){
            for(int j=0 ; j<nums.get(i).size() ; j++){
                while(dummy.size()<=(i+j)){
                    List<Integer> lis = new ArrayList<>();
                    dummy.add(lis);
                }
                dummy.get(i+j).add(nums.get(i).get(j));
            }
        }
        int[] arr = new int[size];
        int ind=0;
        for(int i=0 ; i<dummy.size() ; i++){
            for(int j=dummy.get(i).size()-1 ; j>=0 ; j--){
                arr[ind++] = dummy.get(i).get(j);
            }
        }
        return arr;
    }
}