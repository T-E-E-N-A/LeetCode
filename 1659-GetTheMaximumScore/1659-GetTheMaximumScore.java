// Last updated: 8/2/2025, 11:32:13 PM
class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0,sum=0;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                sum += Math.max(sum1,sum2);
                sum += nums1[i];
                sum1=0;sum2=0;
                i++;j++;
            }else if(nums1[i]>nums2[j]){
                sum2 += nums2[j++];
            }else{
                sum1 += nums1[i++];
            }
        }
        while(i<nums1.length) sum1 += nums1[i++];
        while(j<nums2.length) sum2 += nums2[j++];
        if(nums1[nums1.length-1]!=nums2[nums2.length-1]){
            sum += Math.max(sum1,sum2);
        }
        return (int)(sum%1000000007);
    }
}