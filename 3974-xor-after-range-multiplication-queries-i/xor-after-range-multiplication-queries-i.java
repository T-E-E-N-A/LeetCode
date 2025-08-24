class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0 ; i<queries.length ; i++){
            int index=queries[i][0];
            while(index<=queries[i][1]){
                nums[index] = (int)((nums[index]*(long)queries[i][3])%1000000007);
                index += queries[i][2];
            }
        }
        long xorAns=nums[0];
        for(int i=1 ;i<nums.length ; i++) xorAns = (xorAns^nums[i]);
        return (int)xorAns;
    }
}