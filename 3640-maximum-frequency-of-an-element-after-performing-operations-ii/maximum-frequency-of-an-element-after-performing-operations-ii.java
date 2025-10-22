class Solution {
    private int check(int[] nums, int n, int k, int numOperations) {
        long nL = n;
        long tL = k;
        // l is just smaller num than n
        int l = Bound(nums, nL,true);
        // next to present 
        int h = Bound(nums, nL,false);

        // lower bound of n-k
        int ll = Bound(nums, nL - tL,true);

        // higher/upper bound of n+k
        int hh = Bound(nums, nL + tL,false);
        
        int res = (hh - h) + (l - ll);
        // h-l is freq of n itself (need 0 operations)
        return Math.min(numOperations, res) + (h - l);
    }

    // lowerBound upperBound merged by using boolean variable and extra else if condition
    private int Bound(int[] arr, long target,boolean lower) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
                if (lower && arr[mid] < target) l = mid + 1;
                else if (!lower && arr[mid] <= target) l = mid + 1;
                else r = mid;
        }
        return l;
    }
/*
    private int lowerBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    private int upperBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
*/
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        int ans = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            ans = Math.max(ans, check(nums, nums[i], k, numOperations));
            ans = Math.max(ans, check(nums, nums[i] - k, k, numOperations));
            ans = Math.max(ans, check(nums, nums[i] + k, k, numOperations));
        }
        return ans;
    }
}

// memory limit exceeded 
// class Solution {
//     public int maxFrequency(int[] nums, int k, int numOperations) {
//         int maxVal = Arrays.stream(nums).max().getAsInt() +1;

//         long[] fre = new long[maxVal];
//         for(int i:nums){
//             fre[i]++;
//         }
//         for(int i=1 ; i<maxVal ; i++){
//             fre[i] = fre[i-1]+fre[i];
//         }

//         long ans=1;
//         for(int i=0 ; i<maxVal ; i++){
//             int left = Math.max(0,i-k);

//             int right = Math.min(i+k,maxVal-1);

//             long self = fre[i]- (i>0 ? fre[i-1] : 0);

//             long total = fre[right]- (left > 0 ? fre[left - 1] : 0);

//             ans = Math.max(ans,Math.min(total-self,numOperations)+self);
//         }
//         return (int)ans;
//     }
// }