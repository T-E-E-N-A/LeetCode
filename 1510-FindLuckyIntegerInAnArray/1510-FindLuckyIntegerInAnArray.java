// Last updated: 8/2/2025, 11:32:42 PM
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(int num : map.keySet()){
            if(num==map.get(num)){
                ans = Math.max(ans,num);
            }
        }
        return ans;
    }
}