class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int ans=1;
        while (sb.length() < b.length()) {
            sb.append(a);
            ans++;
        }
        if (sb.indexOf(b)!=-1) return ans;
        sb.append(a);
        if (sb.indexOf(b)!=-1) return ans+1;
        return -1;
    }
}