// Last updated: 8/2/2025, 11:29:28 PM
class Solution {
    public char kthCharacter(long k, int[] operations) {
        long len=1,c=0;
        int i=0;
        List<Long> arr = new ArrayList<>();
        for(int op : operations){
            len *=2;
            arr.add(len);
            if(k<len){
                break;
            }
        }
        i =arr.size()-1;
        while(i>=0){
            long ele = arr.get(i)/2;
            if(k<=ele){
                i--;
                continue;
            }
            k = k - ele;
            if(operations[i]==1) c++;
            i--;
        }
        return (char)('a'+(c%26));
    }
}