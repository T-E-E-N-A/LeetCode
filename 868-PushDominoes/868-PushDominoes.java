// Last updated: 8/2/2025, 11:34:10 PM
class Solution {
    public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int[] score = new int[arr.length];
        // in this,negative in score array represent left and positive represent right and 0 represent dot(.)
        // left to right iteration for right fallings dominoes
        int s=0;
        for(int i=0 ; i<arr.length ; i++){
            // why arr.length bcs force decreases one by one and edge case - R....
            if(arr[i]=='R') s=arr.length;
            else if(arr[i]=='L') s=0;
            else s = Math.max(s-1,0);
            score[i] += s;
        }
        // right to left iteration for left fallings dominoes
        s=0;
        for(int i=arr.length-1 ; i>=0 ; i--){
            // why arr.length bcs force increases(as no. is negative) one by one and edge case - ...L
            if(arr[i]=='L') s=arr.length;
            else if(arr[i]=='R') s=0;
            else s = Math.max(s-1,0);
            score[i] -= s;
        }
        StringBuilder si = new StringBuilder();
        // iterate on array 
        for(int i:score){
            if(i>0){
                si.append("R");
            }else if(i<0){
                si.append("L");
            }else{
                si.append(".");
            }
        }
        return si.toString();
    }
}