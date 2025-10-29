class Solution {
    public int smallestNumber(int n) {
        int ans=1;
        ans = ans<<(Integer.toBinaryString(n).length());
        return ans-1;
    }
}