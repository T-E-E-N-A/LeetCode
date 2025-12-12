class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {

        boolean[] offline = new boolean[numberOfUsers];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        int[] count = new int[numberOfUsers];

        Collections.sort(events,(a,b)->{
            int a1 = Integer.parseInt(a.get(1));
            int b1 = Integer.parseInt(b.get(1));
            return (a1!=b1)? Integer.compare(a1,b1) :  (a.get(0).equals("OFFLINE")? -1 : 1);
        });

        for(List<String> lis : events){
            int timeStamp = Integer.parseInt(lis.get(1));

            while(!pq.isEmpty() && pq.peek()[1]<=timeStamp) offline[pq.poll()[0]] = false;
            
            if(lis.get(0).equals("OFFLINE")){

                offline[Integer.parseInt(lis.get(2))]=true;
                pq.add(new int[]{Integer.parseInt(lis.get(2)),timeStamp+60});

            }else{
                if(lis.get(2).equals("HERE")){

                    for(int i=0 ; i<numberOfUsers ; i++) if(!offline[i]) count[i]++;
        
                }else if(lis.get(2).equals("ALL")){

                    for(int i=0 ; i<numberOfUsers ; i++) count[i]++;

                }else{
                    String[] s = lis.get(2).split(" ");
                    // cnt++ for these users
                    for(String str : s){
                        count[Integer.parseInt(str.substring(2)+"")]++;
                    }
                }
            }
        }
        return count;
    }
}