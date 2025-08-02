// Last updated: 8/2/2025, 11:32:17 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            drink = drink + (empty/numExchange);
            empty = (empty/numExchange) + (empty%numExchange);
        }
        return drink;
    }
}