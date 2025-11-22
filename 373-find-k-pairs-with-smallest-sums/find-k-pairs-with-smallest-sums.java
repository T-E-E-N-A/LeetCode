class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]+a[1])-(b[0]+b[1]));
        for(int i=0 ; i<nums1.length ; i++){
            pq.add(new int[]{nums1[i],nums2[0],0});
        }
        for(int i=0 ; i<k ; i++){
            int[] x = pq.poll();
            List<Integer> lis = new ArrayList<>();
            lis.add(x[0]);
            lis.add(x[1]);
            ans.add(lis);
            if(x[2]+1<nums2.length) pq.add(new int[]{x[0],nums2[x[2]+1],x[2]+1});
        }
        return ans;
    }
}