// Last updated: 8/2/2025, 11:33:34 PM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li = new ArrayList<>();
        int c=0,r=0,x=0;
        for(int i=num.length-1 ; i>=0 ; i--){
            li.add(0,(num[i]+k%10+c)%10);
            c = (num[i]+(k%10)+c)/10;
            k/=10;
        }
        while(k!=0){
            li.add(0,(k%10+c)%10);
            c=(k%10 + c)/10;
            k /=10;
        }
        if(c!=0){
            li.add(0,c);
        }
        return li;
    }
}