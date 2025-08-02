// Last updated: 8/2/2025, 11:34:34 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
         int ans = 0, start = 0, end = 0, product = 1;
        while (end < arr.length){
            //grow
            product = product * arr[end];

            // shrink
            while (product >= k && start <= end){
                product = product / arr[start];
                start++;
            }
            // ans update
            ans = ans + (end - start + 1);
            end ++;
        }
        return ans;

    }
}