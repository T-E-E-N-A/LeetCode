class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum=0;
        int one=999999,two=999999;
        for(int i:nums){
            sum += i;
            if(i%3==1){
                two = Math.min(two,one+i);
                one = Math.min(one,i);
            }else if(i%3==2){
                one = Math.min(one,two+i);
                two = Math.min(two,i);
            }
        }
        if(sum%3==0) return sum;
        if(sum%3==1) return sum-one;
        return sum-two;
    }
}