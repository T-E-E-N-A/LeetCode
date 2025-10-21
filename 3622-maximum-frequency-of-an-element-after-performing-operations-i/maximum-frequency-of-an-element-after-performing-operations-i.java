// [22,32,74,90]
// k=39
// numOperations=4
// ans=4
// get from this tc: nums not in array are also allowed like making every num 61 in this

class Solution {
    public int maxFrequency(int[] nums, int k, int numOps) {
        int maxVal = Arrays.stream(nums).max().getAsInt()+1;

        int[] count = new int[maxVal];

        for (int v : nums)
            count[v]++;

        // to store elements smaller or equal to that index
        for (int i = 1; i < maxVal; i++)
            count[i] += count[i - 1];

        int res = 0;
        for (int i = 0; i < maxVal; i++) {
            // why doing only i-k not i-2*k or so on
            // further when we move to i,we use i-k and i-k will involve (i-k)-k ...
            // similar for right
            int left = Math.max(0, i - k);
            int right = Math.min(maxVal - 1, i + k);

            int total = count[right] - (left > 0 ? count[left - 1] : 0);

            // freq contains same number of freq which doesn't require numOperations
            int freq = count[i] - (i > 0 ? count[i - 1] : 0);

            // Math.min(numOps, total - freq) if less operations are there or needed ...
            res = Math.max(res, freq + Math.min(numOps, total - freq));
        }

        return res;
    }
}

// tried 2pointer if only array elements allowed but...........
// now range come so will use binary search