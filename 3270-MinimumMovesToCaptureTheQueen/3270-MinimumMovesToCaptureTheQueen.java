// Last updated: 8/2/2025, 11:29:51 PM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(a==e){
            if(a!=c || (!(b<d && d<f) && !(d>f && d<b))){
                return 1;
            }
        }else if(b==f){
            if(b!=d || (!(a<c && c<e) && !(c>e && c<a))) return 1;
        }else if(Math.abs(c-e)==Math.abs(d-f)){
            if(Math.abs(a-c)==Math.abs(b-d) && Math.abs(a-e)==Math.abs(b-f)){
                if((d<b && b<f) || (b>f && b<d)) return 2;
                else return 1;
            }else return 1;
        }
        return 2;
    }
}