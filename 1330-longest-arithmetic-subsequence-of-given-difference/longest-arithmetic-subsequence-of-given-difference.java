class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++)
            map.put(arr[i],map.getOrDefault(arr[i]-diff,0)+1);
        
        int ans=0;
        for(int i:map.keySet()) ans = Math.max(map.get(i),ans);
        return ans;
    }
}