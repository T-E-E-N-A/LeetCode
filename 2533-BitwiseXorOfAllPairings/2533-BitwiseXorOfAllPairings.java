// Last updated: 8/2/2025, 11:30:42 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        if(nums1.length%2==0 && nums2.length%2==0){
            return 0;
        }
        int ans=0;
        if(nums1.length%2==0){
            for(int i=0 ; i<nums1.length ; i++){
                ans = ans^nums1[i];
            }
        }else if(nums2.length%2==0){
            for(int i=0 ; i<nums2.length ; i++){
                ans = ans^nums2[i];
            }
        }else{
            for(int i=0 ; i<nums2.length ; i++){
                ans = ans^nums2[i];
            }
            for(int i=0 ; i<nums1.length ; i++){
                ans = ans^nums1[i];
            }
        }
        return ans;
    }
}