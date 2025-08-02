// Last updated: 8/2/2025, 11:32:49 PM
class Solution {
    public int maxEvents(int[][] events) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        int day=0;
        // sorted the events by initial days
        Arrays.sort(
            events , (a,b) -> a[0]-b[0]
        );
        int ans=0;
        int n = events.length;
        while(i<n || !pq.isEmpty()){
            if(pq.isEmpty()) day=events[i][0];

            while(i<n && events[i][0]<=day ){
                pq.add(events[i][1]);
                i++;
            }
            pq.poll();
            day++;
            ans++;
            // events we can;'t attend are removed by this
            while(!pq.isEmpty() && day>pq.peek()) pq.poll();
        }
        return ans;
    }
}