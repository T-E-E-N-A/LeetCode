// Last updated: 8/2/2025, 11:56:33 PM
class Solution {
    public String getPermutation(int n, int k) {
        int[] arr = new int[n];
        String str = "";
        if(k==1){
            for(int i=0 ;i<n; i++){
                str += (i+1);
            }
            return str;
        }
        for(int i=0 ; i<n ; i++){
            arr[i] = i+1;
        }
        for(int i=1 ;i<k ; i++){
            str = permute(arr);
        }
        return str;
    }
    public String permute(int[] arr){
        int p=-1;
        for(int i=arr.length-2 ; i>=0 ; i--){
            if(arr[i] < arr[i+1]){
                p = i;
                break;
            }
        }
        if(p==-1){
            reverse(arr,0,arr.length-1);
        }else{
            int q=-1;
            for(int i=arr.length-1 ; i>p ; i--){
                if(arr[i]>arr[p]){
                    q = i;
                    break;
                }
            }
            // swap p and q 
            int temp= arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            reverse(arr,p+1,arr.length-1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<arr.length ; i++){
            sb.append(arr[i]+"");
        }
        return sb.toString();
    }
    public void reverse(int[] arr, int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
} 