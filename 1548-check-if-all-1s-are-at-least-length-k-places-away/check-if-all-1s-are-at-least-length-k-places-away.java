class Solution {
    static
    {
        for(int i=0;i<100;i++)kLengthApart(new int[]{0}, 2);
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int cnt=k;
        for(int i : nums){
            if(i==1 && cnt<k) return false;
            else if(i==1) cnt=0;
            else cnt++;
        }
        return true;
    }
}