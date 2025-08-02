// Last updated: 8/2/2025, 11:32:39 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int i=0 ; i<candies.length ; i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}