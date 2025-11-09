class Solution {
    public int countOperations(int num1, int num2) {
        if(num1==0 || num2==0) return 0;

        // recursion
        // return 1+countOperations(Math.min(num1,num2), Math.max(num1,num2)-Math.min(num1,num2));
        int c=0;
        while(num1!=0 && num2!=0){
            c++;
            int x= Math.min(num1,num2);
            num2 = Math.abs(num1-num2);
            num1=x;
        }
        return c;
    }
}