// Last updated: 8/2/2025, 11:29:00 PM
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long ans=0;
        int i=0;
        while(i>=0 && i<instructions.length && !instructions[i].equals(".")){
            if(instructions[i].equals("jump")){
                instructions[i]=".";
                i += values[i];
            }else{
                instructions[i]=".";
                ans += values[i];
                i++;
            }
        }
        return ans;
    }
}