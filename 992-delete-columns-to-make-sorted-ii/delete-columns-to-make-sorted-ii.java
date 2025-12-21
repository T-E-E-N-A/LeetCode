class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        boolean[] ar = new boolean[n];
        return fun(ar,strs);
    }
    public int fun(boolean[] ar,String[] strs){
        int ans=0;
        int n = strs[0].length();
        for(int i=1 ; i<strs.length ; i++){
            int j=0;
            while(j<n && (strs[i].charAt(j)<=strs[i-1].charAt(j) || ar[j])){
                j++;
                if(strs[i].charAt(j-1)==strs[i-1].charAt(j-1) || ar[j-1]) continue;
                ar[j-1]=true;
                return 1+fun(ar,strs);
            }
        }
        return ans;
    }
}