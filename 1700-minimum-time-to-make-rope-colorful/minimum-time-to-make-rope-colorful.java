class Solution {
    public int minCost(String colors, int[] neededTime) {
        int total=neededTime[neededTime.length-1];
        int ans=0;
        int max=neededTime[0];
        for(int i=0 ; i<colors.length()-1 ; i++){
            if(colors.charAt(i+1)==colors.charAt(i)){
                max = Math.max(max,neededTime[i+1]);
            }else{
                ans += max;
                max = neededTime[i+1];
            }

            total += neededTime[i];
        }
        ans += max;
        return (total-ans);
    }
}