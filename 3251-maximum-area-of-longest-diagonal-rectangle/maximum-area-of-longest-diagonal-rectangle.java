class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        long max=dimensions[0][0]*(long)dimensions[0][0] + dimensions[0][1]*dimensions[0][1];
        int ind=0;
        for(int i=1 ; i<dimensions.length ; i++){
            long cal = dimensions[i][0]*(long)dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            if(cal>max){
                ind = i;
                max = cal;
            }else if(cal==max && dimensions[ind][0]*dimensions[ind][1] < dimensions[i][0]*dimensions[i][1]){
                ind = i;
            }
        }
        return dimensions[ind][0]*dimensions[ind][1];
    }
}