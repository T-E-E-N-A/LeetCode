class Solution {
    public int scheduleCourse(int[][] courses) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(courses,(a,b)->{
            if(a[1]==b[1]) return (a[0]-b[0]);
            return (a[1]-b[1]);
        });
        long sum=0;
        for(int i=0 ; i<courses.length ; i++){
            if(sum+courses[i][0]<=courses[i][1]){
                pq.add(courses[i][0]);
                sum += courses[i][0];
            }else{
                if(!pq.isEmpty() && courses[i][0]<pq.peek()){
                    System.out.println(pq.peek());
                    sum -= pq.poll();
                    sum += courses[i][0];
                    pq.add(courses[i][0]);
                }
            }
        }
        return pq.size();
    }
}




// LIS approach failed as further we can get small order doesn't matter
// tc - [[7,17],[3,12],[10,20],[9,10],[5,20],[10,19],[4,18]]

// class Solution {
//     public int scheduleCourse(int[][] courses) {
//         ArrayList<Integer> lis = new ArrayList<>();
//         Arrays.sort(courses,(a,b)->{
//             if(a[1]==b[1]) return (a[0]-b[0]);
//             return (a[1]-b[1]);
//         });
//         for(int i=0 ; i<courses.length ; i++){
//             if(courses[i][0]>courses[i][1]) continue;
//             if(lis.isEmpty()){
//                 lis.add(courses[i][0]);
//                 continue;
//             }
//             int j = lis.size()-1;
//             if(j>=0 && lis.get(j)+courses[i][0]<=courses[i][1]) lis.add(lis.get(j)+courses[i][0]);
//             else{
//                 while(j>0 && (lis.get(j-1)+courses[i][0]>lis.get(j) || lis.get(j-1)+courses[i][0]>courses[i][1])){
//                     j--;
//                 }
//                 if(j>0 && lis.get(j-1)+courses[i][0]<=courses[i][1]){
//                     lis.set(j,lis.get(j-1)+courses[i][0]);
//                 }
//                 if(j==0 && lis.get(0)>courses[i][0]){
//                     lis.set(0,courses[i][0]);
//                 }
//             }
//         }
//         return lis.size();
//     }
// }