// Last updated: 8/2/2025, 11:57:08 PM
class Solution {
    public int search(int[] arr, int find) {
        int n = arr.length;
        int start=0 , end = n-1;
        int flag=0;
        int mid = start + (end-start)/2;
        while(start<=end){
            if(arr[mid]==find){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(find>=arr[start] && find<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(find>arr[mid] && find<=arr[end] ){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
}