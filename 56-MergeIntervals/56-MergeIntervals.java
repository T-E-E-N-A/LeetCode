// Last updated: 8/2/2025, 11:56:38 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals ,(x,y) -> Integer.compare(x[0],y[0]));
        List<int[]> li = new ArrayList<>();
        int start  =  intervals[0][0];
        int end =  intervals[0][1]; 
            
        int  i =1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if( s<=end  ) { 
                end =  Math.max(end,e);
            }
            else{
                li.add(new int[]{start,end});
                start = s;
                end =  e;                
            }
            i++;
        }
        li.add(new int[] {start,end});
        return li.toArray(new int[li.size()][]);
    }
}