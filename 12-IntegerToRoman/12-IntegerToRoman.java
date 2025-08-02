// Last updated: 8/2/2025, 11:57:40 PM
class Solution {
    public String intToRoman(int num) {
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] arra = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String s = new String();
        int i=0;
        while(num>0 && i<arr.length){
            if(num>=arr[i]){
                num -= arr[i];
                s += arra[i];
            }else{
                i++;
            }
        }
        return s;
    }
}