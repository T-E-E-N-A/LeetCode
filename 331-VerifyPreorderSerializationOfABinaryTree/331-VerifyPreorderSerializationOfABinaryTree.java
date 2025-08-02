// Last updated: 8/2/2025, 11:35:56 PM
class Solution {
    int i=0;
    // do it like iterating on binary tree calling left first then right for preorder
    public boolean isValidSerialization(String preorder) {
        String[] arr = preorder.split(",");
        // i condition to check if element exist in string but tree is finished
        return fun(arr) && i>=arr.length-1;
    }
    public boolean fun(String[] arr){
        // checking if array finish but not tree
        if(i>=arr.length) return false;

        // leaf condition check
        if(arr[i].equals("#")) return true;
        
        // going on left side........
        i++;
        boolean a = fun(arr);

        // goinf on right side.......
        i++;
        boolean b = fun(arr);

        // both should be correct
        return a && b;
    }
}