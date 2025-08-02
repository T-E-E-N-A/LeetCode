// Last updated: 8/2/2025, 11:35:50 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        List<Integer> lis = new ArrayList<Integer>();
        for(int i=0 ; i<nums1.length ; i++){
            count[nums1[i]]++;
        }
        for(int i=0 ; i<nums2.length ; i++){
            if(count[nums2[i]]>=1){
                lis.add(nums2[i]);
                count[nums2[i]]=0;
            }
        }
        int arr[] = new int[lis.size()];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = lis.get(i);
        }
        return arr;
    }
}