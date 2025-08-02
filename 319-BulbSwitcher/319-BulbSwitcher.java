// Last updated: 8/2/2025, 11:36:01 PM
class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
        // bulbs who are perfect square will be turned on
    }
}

// Memory limit exceeded
// class Solution {
//     public int bulbSwitch(int n) {
//         int ans=0;
//         int[] arr = new int[n+1];
//         arr[0]=1;
//         for(int i=2 ; i<=n ; i++){
//             int j=1;
//             while(i*j<=n){
//                 arr[i*j]++;
//                 j++;
//             }
//         }
//         for(int i=0 ; i<=n ; i++){
//             if(arr[i]%2==0) ans++;
//         }
//         return ans;
//     }
// }