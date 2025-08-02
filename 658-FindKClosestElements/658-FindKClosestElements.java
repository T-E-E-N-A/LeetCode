// Last updated: 8/2/2025, 11:34:37 PM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> li = new ArrayList<>();
        int start=0,end=arr.length-1;
        while(end-start >= k){
            if(Math.abs(arr[start]-x) > Math.abs(arr[end]-x)){
                start++;
            }else{
                end--;
            }
        }
        for(;start<=end ; start++){
            li.add(arr[start]);
        }
        return li;
    }
}