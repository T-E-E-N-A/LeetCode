class Solution {
    public int minCut(String s) { //cuts=no. of partitions-1
        boolean[][] ispalin=new boolean[s.length()][s.length()];
        //precomputed all palindromes to ensure O(1) check for palindromes
        for(int i=s.length()-1 ; i>=0 ; i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || ispalin[i+1][j-1]))
                    ispalin[i][j]=true;
            }
        }

        int[] dp=new int[s.length()+1]; //for min cuts
        dp[0]=-1;

        // System.out.println(ispalin[s.length()-1][0]);

        for(int i=1;i<=s.length();i++){
            dp[i]=i-1; //worst case of same chars
            for(int j=0;j<i;j++){
                if(ispalin[j][i-1]){
                    dp[i]=Math.min(dp[i], dp[j]+1);
                }

            }
        }
        return dp[s.length()]; 
    }
}


// TIME LIMIT EXCEEDED
// TIME COMPLEXITY : O(N^3)

/*
class Solution {
    public int minCut(String s) {
        if(s.length()==0) return 0;
        return fun(s);
    }
    public int fun(String s){
        if(s.length()==1) return 0;
        if(ispalin(s)) return 0;
        int ans=Integer.MAX_VALUE;
        for(int j=1 ; j<s.length() ; j++){
            int a = fun(s.substring(0,j)); //N
            int b = fun(s.substring(j)); //N
            ans = Math.min(ans,a+b+1);
        }
        return ans;
    }
    public boolean ispalin(String st){ //O(N) check for palindrome
        int i=0, j=st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j))   return false;
            i++;j--;
        }
        return true;
    }
}
*/