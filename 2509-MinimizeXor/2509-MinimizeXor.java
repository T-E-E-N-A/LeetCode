// Last updated: 8/2/2025, 11:30:47 PM
class Solution {
    public int minimizeXor(int num1, int num2) {
        int c=0;
        while(num2!=0){
            int com = ~num2+1;
            num2 -= (num2 & com);
            c++;
        }
        int co=0;
        int copy=num1;
        while(copy!=0){
            int com = ~copy+1;
            copy -= (copy & com);
            co++;
        }
        copy=num1;
        if(co==c){
            return copy;
        }
        if(c>co){
            while(c-co>0){
                int com = copy+1;
                com = ~copy & com;
                copy = copy+ com;
                co++;
            }
        }else{
            while(co>c){
                int com = ~copy+1;
                copy -= (copy & com);
                co--;
            }
        }
        return copy;
    }
}