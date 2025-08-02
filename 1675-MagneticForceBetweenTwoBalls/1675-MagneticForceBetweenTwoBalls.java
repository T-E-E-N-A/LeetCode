// Last updated: 8/2/2025, 11:32:11 PM
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0,high=position[position.length-1]-position[0];
        int ans=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            // System.out.println(mid);''
            if(isPossible(position , mid,m)){
                ans = Math.max(ans,mid);
                low = mid+1;
                // System.out.println(mid);
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] position , int mid ,  int m){
        int x=0;
        int c=1;
        for(int i=1 ; i<position.length ; i++){
            int sum = position[i]-position[x];
            if(sum>=mid){
                x=i;
                c++;
            }
        }
        if(c<m){
            return false;
        }
        return true;
    }
}