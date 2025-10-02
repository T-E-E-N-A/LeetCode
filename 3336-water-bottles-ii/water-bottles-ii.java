class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=numBottles;
        int ans = numBottles;
        while(empty>=numExchange){
            empty -= numExchange;
            numExchange++;
            ans++;
            empty++;
        }
        return ans;
    }
}