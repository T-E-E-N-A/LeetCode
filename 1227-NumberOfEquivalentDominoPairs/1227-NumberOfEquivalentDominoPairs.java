// Last updated: 8/2/2025, 11:33:20 PM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans=0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ;i<dominoes.length ;i++){
            int num1 = dominoes[i][0]*10+dominoes[i][1];
            int num2 = dominoes[i][1]*10+dominoes[i][0];
            if(map.containsKey(num1)){
                map.put(num1,map.get(num1)+1);
                continue;
            }
            if(map.containsKey(num2)){
                map.put(num2,map.get(num2)+1);
                continue;
            }
            map.put(num1,1);
        }
        for(int num : map.keySet()){
            int a = map.get(num);
            ans += a*(a-1)/2;
            System.out.println(a);
        }
        return ans;
    }
}