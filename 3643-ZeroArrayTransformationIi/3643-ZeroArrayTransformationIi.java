// Last updated: 8/2/2025, 11:29:18 PM
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        // line sweep method
        int sum=0,k=0;
        int l=0,r=0,n=nums.length;
        int[] helper = new int[n+1];
        for(int i=0;i<n ; i++){
            while(sum + helper[i] < nums[i]){
                k++;
                if(k>queries.length){
                    return -1;
                }
                l = queries[k-1][0];
                r = queries[k-1][1];
                int val = queries[k-1][2];
                if(i<=r){
                    helper[r+1] -= val;
                    helper[Math.max(i,l)] += val; 
                }
            }
            sum += helper[i];
        }
        return k;
    }
}


// TIME LIMIT EXCEEDED 624/627
// class Solution {
//     public int minZeroArray(int[] nums, int[][] queries) {
//         int c=0,ans=0;
//         boolean[] arr = new boolean[nums.length];
//         for(int i=0;i<nums.length ; i++){
//             if(nums[i]==0){
//                 c++;
//                 arr[i] = true;
//             }
//         }
//         if(c==nums.length){
//             return 0;
//         }
//         for(int i=0;i<queries.length ; i++){
//             int l = queries[i][0];
//             int r = queries[i][1];
//             int k = queries[i][2];
//             for( ; l<=r
//              ; l++){
//                 nums[l] = (nums[l]-k)>0?(nums[l]-k):0;
//                 if(!arr[l] && nums[l]==0){
//                     c++;
//                     arr[l]=true;
//                 }
//             }
//             ans++;
//             if(c==nums.length){
//                 return ans;
//             }
//         }
//         if(c!=nums.length){
//             return -1;
//         }
//         return ans;
//     }
// }