class Solution {
    public boolean isPossible(int[] target) {
        // if(target.length==2 && (target[0]==1 || target[1]==1)) return true;
        // 8 5 -> largest-sum
        // 3 5 -> 3 2 -> 1 2 -> 1 1
        // 9 3 5
        // 1 3 5 -> 1 3 1 -> 1 1 1
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int i=0 ; i<target.length ; i++){
            pq.add(target[i]);
            sum += target[i];
        }
        while(true){
            int x = pq.poll();
            long y = sum-x;
            if(y==1 || x==1) return true;
            if(y==0 || y>=x || x%y==0) return false;

            pq.add((int)(x%y));
            sum = y+ (x%y);
        }
    }
}