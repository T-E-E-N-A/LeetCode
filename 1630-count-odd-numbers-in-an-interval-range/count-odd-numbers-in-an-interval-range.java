class Solution {
    public int countOdds(int low, int high) {
        return (high-low+1)/2 + ((high-low+1)%2==0? 0 : (low%2));
    }
}