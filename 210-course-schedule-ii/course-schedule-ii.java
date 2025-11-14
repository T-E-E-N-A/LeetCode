class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // topological sort
        // directed acyclic graph (DAG) : for correct topological order (#no cycle)

        // build adjacency list
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0 ; i<numCourses ; i++) adj.add(new ArrayList<>());
        for(int[] course : prerequisites){
            adj.get(course[1]).add(course[0]);
        }

        // build indeg array and Queue 
        int[] indeg = new int[numCourses];
        Queue<Integer> qu = new LinkedList<>();
        for(int[] course : prerequisites) indeg[course[0]]++;
        for(int i=0 ;  i<numCourses ; i++) if(indeg[i]==0) qu.add(i);
        int[] order = new int[numCourses];
        int k=0;

// let's iterate over it 
        while(!qu.isEmpty()){
            int x = qu.poll();
            // System.out.println(x+" "+adj.get(x));

            order[k++] = x;

            for(int nbrs : adj.get(x)){
                indeg[nbrs]--;
                if(indeg[nbrs]==0) qu.add(nbrs);
            }
        }
        if(k!=numCourses) return new int[0];

        return order;
    }
}