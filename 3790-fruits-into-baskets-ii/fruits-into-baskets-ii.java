class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        for(int i=0; i<fruits.length ; i++){
            int j=0;
            for( ; j<baskets.length ; j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=-1;
                    break;
                }
            }
            if(j==baskets.length) c++;
        }
        return c;
    }
}