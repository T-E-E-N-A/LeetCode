// Last updated: 8/2/2025, 11:57:51 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length+nums2.length];
        for(int i=0 ; i<nums1.length ; i++){
            num[i] = nums1[i];
            if(i<nums2.length){
                num[i+nums1.length] = nums2[i];
            }
        }
        for(int i=nums1.length*2 ; i<nums2.length+nums1.length; i++){
            num[i] = nums2[i-nums1.length];
        }
        Arrays.sort(num);
        double mid=0;
        if(num.length%2==0){
            mid = ((double)num[num.length/2] + num[num.length/2 - 1])/2;
        }else{
            mid = num[num.length/2];
        }
        return mid;
    }
}