// Last updated: 8/2/2025, 11:32:47 PM
class Solution {
    public List<Integer> luckyNumbers(int[][] num) {
        int min=Integer.MAX_VALUE;
        List<Integer> li = new ArrayList<>();
        for(int i=0 ; i<num.length ; i++){
            int ind=0;
            min=Integer.MAX_VALUE;
            for(int j=0 ; j<num[0].length ; j++){
                if(num[i][j]<min){
                    min=num[i][j];
                    ind = j;
                }
            }
            int c=1;
            for(int j=0; j<num.length ; j++){
                if(min>num[j][ind]){
                    c++;
                }
            }
            if(c==num.length){
                li.add(min);
            }
        }
        return li;
    }
}