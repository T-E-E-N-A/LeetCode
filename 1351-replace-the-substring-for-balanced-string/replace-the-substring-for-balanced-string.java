class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int[] arr = new int[26];
        // 0 index-Q 1-W 2-E 3-R
        for(int i=0 ; i<n ; i++){
            arr[s.charAt(i)-'A']++;
        }

        // NOW FIND SUBSTRING HAVING THESE MAP FREQUENCY

        int len=n;
        int cnt=0;
        int i=0,st=0;

        // idx = {4,16,17,22}; - idx of EQRW
        while(i<n){
            arr[s.charAt(i)-'A']--;

            while(st<n && arr[4]<=n/4 && arr[16]<=n/4 && arr[17]<=n/4 && arr[22]<=n/4){
                len = Math.min(len,i-st+1);

                arr[s.charAt(st)-'A']++;

                st++;
            }
            i++;
        }
        return len;
    }
}