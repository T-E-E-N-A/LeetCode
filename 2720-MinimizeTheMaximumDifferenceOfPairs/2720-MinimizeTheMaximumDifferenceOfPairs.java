// Last updated: 8/2/2025, 11:30:16 PM
class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int high=nums[nums.length-1]-nums[0];
        int low = 0;
        int ans=high;
        while(high>=low){
            int mid = low + (high-low)/2;
            if(isPossible(nums,p,mid)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    // np-> no. of pair
    // fn check if minimum maximum pair can be here
    public static boolean isPossible(int[] nums,int np,int val){
        int i=1;
        while(i<nums.length){
            if(nums[i]-nums[i-1]<=val){
                np--;
                i++;
            }
            i++;
            if(np==0) return true;
        }
        return np<=0;
    }
}