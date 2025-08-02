// Last updated: 8/2/2025, 11:56:37 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> li = new ArrayList<>();
        // before merger
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            li.add(intervals[i]);
            i++;
        }

        // merge
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        li.add(newInterval);


        // after merger
        while(i<intervals.length && intervals[i][0]>newInterval[1]){
            li.add(intervals[i]);
            i++;
        }
        return li.toArray(new int[li.size()][]);
    }
}