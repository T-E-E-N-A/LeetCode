class Solution {
    static int[][] store;
    public int countCoveredBuildings(int n, int[][] buildings) {
        store = new int[n+1][4];
        for(int[] i : store){
            i[0]  = Integer.MAX_VALUE;
            i[2]  = Integer.MAX_VALUE;
        }
        // 0,2-index min 1,3-index max;
        for(int[] ar : buildings){
            store[ar[0]][0] = Math.min(store[ar[0]][0],ar[1]);
            store[ar[0]][1] = Math.max(store[ar[0]][1],ar[1]);
            store[ar[1]][2] = Math.min(store[ar[1]][2],ar[0]);
            store[ar[1]][3] = Math.max(store[ar[1]][3],ar[0]);
        }
        int ans=0;
        for(int[] a : buildings){
            if(store[a[0]][0]<a[1] && store[a[0]][1]>a[1] && store[a[1]][2]<a[0] && store[a[1]][3]>a[0]) ans++;
            
        }
        return ans;
    }
}