// Last updated: 8/2/2025, 11:28:49 PM
class Solution {
    private int[][] pre;

    private int max_subarray_sum(int a, int b, String s, int k) {
        int n = s.length();
        int l = 0, r = k;

        int r_freq_a = 0, r_freq_b = 0;
        int l_freq_a = 0, l_freq_b = 0;

        int sum = Integer.MIN_VALUE;
        // mat denotes second part, we have to minimize it
        final int INF = 100000000;
        int[][] mat = {{INF, INF}, {INF, INF}};

        // n+1 array size of pre
        while (r < n+1) {
            // update right-side prefix counts
            r_freq_a = pre[a][r];
            r_freq_b = pre[b][r];

            // can we move window from left
            while (r -l >= k && (r_freq_b - l_freq_b) >= 2) {
                // update current minimum
                mat[1 & l_freq_a][l_freq_b & 1] =
                    Math.min(mat[1 & l_freq_a][1 & l_freq_b], l_freq_a - l_freq_b);

                // move towards next window
                // minimising window size by 1
                l_freq_a = pre[a][l + 1];
                l_freq_b = pre[b][l + 1];
                l++;
            }

            // calculate current subarray sum
            // if freq_a is odd & freq_b is even then mat[0][0] is substracted from diff of frequencies?? don't know whyy
            int calc = (r_freq_a - r_freq_b) - mat[(1 & r_freq_a) ^ 1][1 & r_freq_b];
            sum = Math.max(calc, sum);

            // increasing window size
            r++;
        }

        return sum;
    }

    // leetcode provided function
    public int maxDifference(String s, int k) {
        int n = s.length();
        // resizing the arr to n+1 length and 5 size i.e. 0,1,2,3,4
        pre = new int[5][n + 1];

        for (int i = 0; i < n; i++) {
            /// move all frequencies to current index
            for (int j = 0; j <= 4; j++) {
                pre[j][i + 1] = pre[j][i];
            }

            int conv = s.charAt(i) - '0';
            pre[conv][i + 1]++;
        }

        // till now we have tried to create an array in which row specifying which number and column telling increasing count(frequency)


        int diff = Integer.MIN_VALUE;
        // going from all possible pairs
        for (int i = 0; i <= 4; i++) {
            // odd lesser than 1 i.e. equals to 0
            if (pre[i][n] == 0) continue;

            for (int j = 0; j <= 4; j++) {
                // skipping same number or even whose count<2
                if (i == j || pre[j][n] < 2) continue;

                int calc = max_subarray_sum(i, j, s, k);
                diff = Math.max(diff, calc);
            }
        }

        return diff;
    }
}