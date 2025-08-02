// Last updated: 8/2/2025, 11:33:24 PM
class Solution {
    int count=0;
    public int numTilePossibilities(String tiles) {
    // sorting is not possible in string
        char[] tile = tiles.toCharArray();
    // sorted to match to skip same ans by sorting same are together just check i-1
        Arrays.sort(tile);
        boolean[] visit = new boolean[tiles.length()];
        answer(visit,tile);
    // it has also counted empty answer initially
        return count-1;
    }
    public void answer(boolean[] visit,char[] tile){
        count++;
        for(int i=0 ; i<tile.length ; i++){
        // skipped already included in answer and repeated if first consideration
            if(visit[i] || (i>0 && tile[i]==tile[i-1] && !visit[i-1])){
                continue;
            }
            visit[i] = true;
            answer(visit,tile);
            visit[i] = false;
        }
        return;
    }
}