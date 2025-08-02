// Last updated: 8/2/2025, 11:31:05 PM
class Solution {
    public int minimumLines(int[][] sp) {
        if(sp.length==1 || sp.length==0){
            return 0;
        }
        int count=1;
        Arrays.sort(sp,(x,y)->(x[0]-y[0]));
        for(int i=2 ; i<sp.length ; i++){
            int x = sp[i-2][0];
            int y = sp[i-2][1];
            int x1 = sp[i-1][0];
            int y1 = sp[i-1][1];
            int x2 = sp[i][0];
            int y2 = sp[i][1];
            // formula - (x2 - x1)/(y2 - y1) = (x-x1)/(y-y1)
            // this is formula for a line
            // thus (x2 - x1)*(y-y1) == (x-x1)*(y2 - y1)
            if((x2-x1)*(y-y1) != (x-x1)*(y2 - y1)){
                count++;
            }
        }
        return count;
    }
}