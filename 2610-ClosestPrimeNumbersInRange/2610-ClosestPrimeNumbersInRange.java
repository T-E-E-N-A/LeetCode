// Last updated: 8/2/2025, 11:30:33 PM
class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] arr = isPrime(right+1);
        List<Integer> lis = new ArrayList<>();
        for(int num=left ; num<right+1 ; num++){
            if(!arr[num]){
                lis.add(num);
            }
        }
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<lis.size()-1 ; i++){
            if(lis.get(i+1)-lis.get(i) < min){
                ans[0] = lis.get(i);
                ans[1] = lis.get(i+1);
                min = lis.get(i+1)-lis.get(i);
            }
        }
        return ans;
    }
    public boolean[] isPrime(int n){
        boolean[] arr = new boolean[n];
        arr[0]=arr[1]=true;
        for(int i=2 ; i*i<=n ; i++){
            if(!arr[i]){
                for(int j=i*2; j<n ; j+=i){
                    arr[j] = true;
                }
            }
        }
        return arr;
    }
}