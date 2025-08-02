// Last updated: 8/2/2025, 11:29:24 PM
class Solution {
    public int possibleStringCount(String word, int k) {
        if (word.isEmpty()) return 0;

        int mod = 1000000007;
        // it's really hard to be focused while reading
        // step-1 count groups or freuency of elements occuring together
        // it doesn't affect us which alphabet just count
        List<Integer> lis = new ArrayList<>();
        int c=1;
        for(int i=1 ; i<word.length() ; i++){
            if(word.charAt(i)==word.charAt(i-1)) c++;
            else{
                lis.add(c);
                c=1;
            }
        }
        lis.add(c);
        
        // total number of occurences by multiplying all elements permutation
        long total=1;
        for(int val : lis) total = (total*val)%mod;

        // now if length of list == k that means we have to take atleast one from all and that is the only solution left so ans will be 1 in that case
        if(lis.size()>=k) return (int)total;
        if(word.length()==k) return 1;

        // now instead of finding atleast we will find atmost to (k-1) length then substract it from total which will leave strings of length k and more
        // we will count by iterating over list by considering every grp after another
        // what's in lis
        // if s="aabbccc" lis= {2,2,3}
        // dp has every index as length of string
        int[] dp = new int[k];
        // initially str="" so dp[str.length()]=1; i.e. dp[0]=1
        dp[0]=1;
        for(int i=0 ; i<lis.size(); i++){
            int num=lis.get(i);
            int[] curr = new int[k];
            long sum=0;
            for(int j=i+1 ; j<k ; j++){
                // in this line we are adding total strings can be formed by adding something
                sum = (curr[j-1] + dp[j-1])%mod;
                // checking if any string in which we can;t add more words
                // ex: j=4(length=4) num=2(bb) sum=2 but of length(1) we can't include as we can't make a by appending bb of length 4 at any cost
                // so we substract that
                if(j>num) sum = (sum-dp[j-num-1]+mod)%mod;
                curr[j]=(int)sum;
            }
            dp=curr;
        }
        long ans=0;
        for(int val : dp) ans = (ans+val)%mod;
        return ((int)(total-ans+mod))%mod;
    }
}