class Solution {
    public long totalScore(int hp, int[] damage, int[] requirement) {
        int n = damage.length;
        int[] prefix = new int[n+1];
        prefix[0]=0;
        for(int i=0 ; i<n ; i++){
            prefix[i+1] = prefix[i]+damage[i];
        }
        long ans=0;
        for(int i=0 ; i<n ; i++){
            //needed for this idx 
            int req = prefix[i+1]+requirement[i] - hp;

            int st = Arrays.binarySearch(prefix,0,i+1,req);
            // System.out.println(st);
            if(st<0) st= -st-1;
            ans += (i-st+1);
        }
        return ans;
    }
}

// PREFIX SUM : AS SUBARRAY is needed

/*
Arrays.binarySearch(prefix,0,i+1,req)

If the value req is not found: It returns a negative value that indicates the "insertion point" where the key would need to be inserted to keep the array sorted. The exact formula for this negative value is (-(insertion point) - 1)
*/