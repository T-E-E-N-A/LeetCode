class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]==b[0])? (b[1]-a[1]) : (a[0]-b[0]));
        PriorityQueue<Integer> lis = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] i : intervals){
            if(!lis.isEmpty() && lis.peek()>=i[0]){
                int x = Math.min(i[1],lis.poll());
                if(!lis.isEmpty() && lis.peek()>=i[0]){
                    lis.add(Math.min(i[1]-1,lis.poll()));
                    lis.add(x);
                    continue;
                }
                lis.add(x);
                if(x!=i[1]) lis.add(i[1]);
                else lis.add(i[1]-1);
            }else{
                lis.add(i[1]-1);
                lis.add(i[1]);
            }
        }
        return lis.size();
    }
}