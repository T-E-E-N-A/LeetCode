// Last updated: 8/2/2025, 11:30:50 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int c=0;
        int j=trainers.length-1;
        for(int i=players.length-1 ; i>=0 && j>=0 ; i--){
            if(players[i]<=trainers[j]){
                c++;
                j--;
            }
        }
        return c;
    }
}