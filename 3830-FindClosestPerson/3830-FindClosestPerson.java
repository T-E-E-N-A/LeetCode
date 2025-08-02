// Last updated: 8/2/2025, 11:28:43 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-y)>Math.abs(x-z)){
            return 1;
        }
        if(Math.abs(z-y)<Math.abs(x-z)){
            return 2;
        }
        return 0;
    }
}