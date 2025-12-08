class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int i=1 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                int x = (int)(Math.sqrt(i*i + j*j));
                if(x<=n && x*x==i*i + j*j) ans+=2;
            }
        }
        return ans;
    }
}