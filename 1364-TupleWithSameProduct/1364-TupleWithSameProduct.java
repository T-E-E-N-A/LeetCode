// Last updated: 8/2/2025, 11:33:01 PM
class Solution {
    public int tupleSameProduct(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        int k=0;
        int[] fre = new int[n*n];
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                fre[k] = nums[i]*nums[j];
                k++;
            }
        }
        Arrays.sort(fre);
        int c=0;k=0;
        for(int i=1 ; i<fre.length ; i++){
            if(fre[i]==fre[i-1] && fre[i]!=0){
                k++;
            }else{
                c += k*(k+1)*4;
                k=0;
            }
        }
        return c;
    }
}