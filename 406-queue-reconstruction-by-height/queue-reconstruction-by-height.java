class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            else{
                return b[0]-a[0];
            }
        });
        // sorted array max 0th first 
        // if 0th is same then increasing mei 1st index
        // ex : 70 71 61 50 52 44
        List<int[]> ans = new ArrayList<>();
        for(int[] i : people){
            // inserting i array at index i[1] i.e. based on 1st index
            ans.add(i[1],i);
        }
        // can't convert list to array dirctly need to tell to convert in 2d array with providing dimensions
        return ans.toArray(new int[people.length][2]);
    }
}