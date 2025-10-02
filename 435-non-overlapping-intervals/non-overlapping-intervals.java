class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            else return a[1]-b[1];
        });
        int c=0;
        int last = -60000;
        for(int[] i : intervals){
            if(last>i[0]) c++;
            else last = i[1];
        }
        return c;
    }
}