// Last updated: 8/2/2025, 11:34:21 PM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count=0;
        int max=arr[0];
        for(int i=0 ; i<arr.length ; i++){
            max = Math.max(arr[i],max);
            if(i==max){
                count++;
                if(i+1<arr.length) max = arr[i+1];
            }
        }
        return count;
    }
}