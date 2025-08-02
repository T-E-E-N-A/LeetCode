// Last updated: 8/2/2025, 11:35:13 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow=1;
        long num=points[0][1];
        for(int i=0 ; i<points.length ;i++){
            if(num<points[i][0]){
                arrow++;
                num = points[i][1];
            }
        }
        return arrow;
    }
}