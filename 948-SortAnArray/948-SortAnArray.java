// Last updated: 8/2/2025, 11:33:55 PM
class Solution {
    public int[] sortArray(int[] nums) {
        return ans(nums,0,nums.length-1);
    }
    public int[] ans(int[] nums,int start,int end){
        if(start==end){
            int[] arr = new int[1];
            arr[0] = nums[start];
            return arr;
        }
        int mid = start + (end-start)/2;
        return merge(ans(nums,start,mid),ans(nums,mid+1,end));
    }
    public int[] merge(int[] a, int[] b){
        int[] arr = new int[a.length+b.length];
        int i=0,j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
        return arr;
    }
}