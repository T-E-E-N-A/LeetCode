// Last updated: 8/2/2025, 11:34:16 PM
class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<answers.length ; i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int count=map.getOrDefault(0,0);
        for(int i:map.keySet()){
            if(i!=0 && map.get(i)%(i+1)==0){
                count += (map.get(i)/(i+1))*(i+1);
            }else if(i!=0){
                count += (map.get(i)/(i+1) +1)*(i+1);
            }
        }
        return count;
    }
}