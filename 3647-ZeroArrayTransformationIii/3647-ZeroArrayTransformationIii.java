// Last updated: 8/2/2025, 11:29:17 PM
class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        // use heap to store right index of queries which is greatest
        Arrays.sort(queries,(a,b)->(a[0]-b[0]));

        // greatest will come first
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // for subtracting right ones
        int[] arr = new int[nums.length+1];
        int sum=0, ind=0;

        for(int i=0 ; i<nums.length ; i++){
            sum += arr[i];
            while(ind<queries.length && queries[ind][0]==i){
                pq.add(queries[ind][1]);
                ind++;
            }
            // done adding same index values , now how many needed
            while(sum<nums[i] && !pq.isEmpty() && pq.peek()>=i){
                sum++;
                arr[pq.poll()+1]--; 
            }
            if(sum<nums[i]) return -1;
        }
        return pq.size();
    }
}