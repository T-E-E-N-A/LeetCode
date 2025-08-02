// Last updated: 8/2/2025, 11:31:20 PM
class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min = 0;
        long max = 0;
        long sum=0;
        for(int i=0 ;i<differences.length; i++){
            sum += differences[i];
            if(sum>0)
            max = Math.max(max,sum);
            else
            min = Math.min(min,sum);
        }
        long z = (upper-max)-(lower-min)+1;
        if(z>0){
            return (int)z;
        }else{
            return 0;
        }
    }
}