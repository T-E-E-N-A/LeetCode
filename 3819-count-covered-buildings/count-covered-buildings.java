class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[][] store = new int[n+1][2];
        for(int[] i : store){
            i[0]  = Integer.MAX_VALUE;
        }
        int[][] storey = new int[n+1][2];
        for(int[] i : storey){
            i[0]  = Integer.MAX_VALUE;
        }
        // 0-index min 1-index max;
        for(int[] ar : buildings){
            store[ar[0]][0] = Math.min(store[ar[0]][0],ar[1]);
            store[ar[0]][1] = Math.max(store[ar[0]][1],ar[1]);
        }
        // 0-index min 1-index max;
        for(int[] ar : buildings){
            storey[ar[1]][0] = Math.min(storey[ar[1]][0],ar[0]);
            storey[ar[1]][1] = Math.max(storey[ar[1]][1],ar[0]);
        }
        int ans=0;
        for(int[] a : buildings){
            // upper neeche check but how left right??
            if(store[a[0]][0]<a[1] && store[a[0]][1]>a[1] && storey[a[1]][0]<a[0] && storey[a[1]][1]>a[0]) ans++;
            
        }
        return ans;
    }
}