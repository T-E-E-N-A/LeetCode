// Last updated: 8/2/2025, 11:32:58 PM
class Solution {
    public int maxSumDivThree(int[] nums) {
        int one=10000,two=10000;
        int sum=0;
        for(int num : nums){
            sum += num;

            if(num%3==1){
                two = Math.min(two , one+num);
                one = Math.min(one,num);
            }else if(num%3==2){
                one = Math.min(one,two+num);
                two = Math.min(two,num);
            }
        }
        if(sum%3==0) return sum;
        if(sum%3==1) return sum-one;
        return sum-two;
    }
}