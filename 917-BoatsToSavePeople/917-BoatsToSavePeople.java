// Last updated: 8/2/2025, 11:33:59 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start=0,end=people.length-1;
        int k=0;
        while(start<=end){
            if(people[start]+people[end] <= limit){
                start++;
                end--;
            }else{
                end--;
            }
            k++;
        }
        return k;
    }
}