class Router {
    int size;
    Queue<String> lis = new LinkedList<String>();
    HashSet<String> set = new HashSet<String>();
    // store destination as key and in arrayList timeStamp is stored
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
    public Router(int memoryLimit) {
        size = memoryLimit;
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        String x = convert(source,destination,timestamp);
        if(set.contains(x)) return false;
        lis.add(x);
        set.add(x);
        if(size+1<=lis.size()){
            forwardPacket();
        }
        // if key is not present add empty arrayList
        map.putIfAbsent(destination,new ArrayList<>());
        map.get(destination).add(timestamp);
        return true;
    }
    
    public int[] forwardPacket() {
        if(lis.size()==0) return new int[0];
        String[] s = lis.peek().split(",");
        int[] ans = new int[3];
        for(int i=0;i<3 ; i++) ans[i] = Integer.parseInt(s[i]);
        map.get(ans[1]).remove(0);
        set.remove(lis.poll());
        return ans;
    }
    
    // ============================================================================
    // Note that queries for addPacket will be made in increasing order of timestamp.
    // ============================================================================

    public int getCount(int destination, int startTime, int endTime) {
        int ans=0;
        if(map.containsKey(destination)){
            ArrayList<Integer> sorted_timeStamp = map.get(destination);
            // binary search will return just max of startTime
            int start = get_min(sorted_timeStamp, startTime);
            int end  = get_max(sorted_timeStamp, endTime);
            // System.out.println(start+" "+end);
            if((!(sorted_timeStamp.size()>end) || !(sorted_timeStamp.get(start)>=startTime) || !(sorted_timeStamp.get(end)<=endTime))) return 0;
            else ans = end-start+1;
        }
        return ans;
    }
    public String convert(int s, int d, int time){
        return s+","+d+","+time;
    }
    public int get_min(ArrayList<Integer> lis,int val){
        int s = 0,end=lis.size()-1;
        int ans=0;
        while(s<=end){
            int mid = s + (end-s)/2;
            if(lis.get(mid)>=val){
                ans = mid;
                end = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
    public int get_max(ArrayList<Integer> lis,int val){
        int s = 0,end=lis.size()-1;
        int ans=0;
        while(s<=end){
            int mid = s + (end-s)/2;
            if(lis.get(mid)<=val){
                ans = mid;
                s = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */