// Last updated: 8/2/2025, 11:56:52 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        permute(nums,new ArrayList<>(),li,check);
        return li;
    }
    public void permute(int[] nums,List<Integer> lis,List<List<Integer>> li,boolean[] check){
        if(lis.size()==nums.length){
            li.add(new ArrayList<>(lis));
            return;
        }
        for(int i=0 ;i<nums.length ; i++){
            if(i<nums.length-1){
                if(!(nums[i]!=nums[i+1] || check[i+1])){
                    continue;
                }
            }
            if( !check[i] ){
                check[i]=true;
                lis.add(nums[i]);
                permute(nums,lis,li,check);
                lis.remove(lis.size()-1);
                check[i]=false;
            }
        }
    }
}