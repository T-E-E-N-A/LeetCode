class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        int target=-1;
        for(int i : arr) if(i==0) target=i;
        if(target==-1) return false;
        return fun(arr,start,visited);
    }
    public boolean fun(int[] arr,int st, boolean[] visited){
        if(st<0 || st>=arr.length || visited[st]) return false;
        if(arr[st]==0) return true;

        visited[st] = true;

        if(fun(arr,st-arr[st], visited)) return true;
        if(fun(arr,st+arr[st], visited)) return true;

        return false;
    }
}