class Solution {
    public long maximumTotalDamage(int[] power) {
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0 ; i<power.length ; i++){
            map.put(power[i],map.getOrDefault(power[i],0L)+(long)1);
        }
        long[][] arr = new long[map.size()][2];
        int k=0;
        for(int i : map.keySet()){
            arr[k][0] = i;
            arr[k++][1] = map.get(i);
        }
        Arrays.sort(arr,(a,b)->Long.compare(a[0],b[0]));
        arr[0][1] = arr[0][1]*arr[0][0];
        for(int i=1 ; i<arr.length ; i++){
            long x = arr[i][1]*arr[i][0];
            int st = Math.max(i-3,0);
            arr[i][1] = Math.max(Math.max(arr[i][1],arr[i-1][1]),x);
            while(st<i && (arr[st][0]+2)<arr[i][0]){
                arr[i][1] = Math.max(x+arr[st][1],arr[i][1]);
                st++;
            }
        }
        return arr[arr.length-1][1];
    }
}