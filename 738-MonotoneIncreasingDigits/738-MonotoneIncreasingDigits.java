// Last updated: 8/2/2025, 11:34:29 PM
class Solution {
    public int monotoneIncreasingDigits(int n) {
        if(n<10) return n;
        int num = n;
        int[] arr = new int[(int)Math.log(n)+1];
        int i=arr.length-1;
        while(num>0){
            arr[i--] = num%10;
            num/=10;
        }
        boolean nine=false;
        for(i=0 ; i<arr.length-1 ; i++){
            if(!nine && arr[i]>arr[i+1]){
                arr[i]--;
                check(arr,i);
                nine=true;
            }
            if(nine) arr[i+1] = 9;
            System.out.println(arr[i+1]);
        }
        int ans=0;
        for(int inn : arr){
            ans = ans*10 + inn;
        }
        return ans;
    }
    public void check(int[] arr,int i){
        if(i==0) return;
        if(arr[i-1]>arr[i]){
            arr[i-1]--;
            arr[i] = 9;
            check(arr,i-1);
        }
    }
}