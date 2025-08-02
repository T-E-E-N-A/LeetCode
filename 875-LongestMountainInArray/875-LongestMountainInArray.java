// Last updated: 8/2/2025, 11:34:15 PM
class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3){
            return 0;
        }
        int max = 0;
        for(int i=1 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i-1] && arr[i+1]<arr[i]){
                int start=i,end=i;
                while(start>0 && arr[start-1]<arr[start]){
                    start--;
                }
                while(end<arr.length-1 && arr[end+1]<arr[end]){
                    end++;
                }
                max = Math.max(max,end-start+1);
            }
        }
        return max;
    }
}