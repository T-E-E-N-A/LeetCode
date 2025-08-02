// Last updated: 8/2/2025, 11:32:44 PM
class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int i=1 ; i<=n ; i++){
            int sum =  calculate(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
            max = Math.max(max,map.get(sum));
        }
        int c=0;
        for(int i : map.keySet()){
            if(map.get(i)==max){
                c++;
            }
        }
        return c;
    }
    public int calculate(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
}