class Solution {
    public boolean reorderedPowerOf2(int n) {
        int len = (int)(Math.log10(n));
        int copy = n;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(copy>0){
            map.put(copy%10,map.getOrDefault(copy%10,0)+1);
            copy = copy/10;
        }
        int pow=1;
        while((int)Math.log10(pow)!=len) pow = pow*2;
        while((int)Math.log10(pow)==len){
            // check for hashaMap<>() every value;
            HashMap<Integer,Integer> check = new HashMap<>();
            copy = pow;
            while(copy>0){
                check.put(copy%10,check.getOrDefault(copy%10,0)+1);
                copy = copy/10;
            }
            if(check.equals(map)) return true;
            pow = pow*2;
        }
        return false;
    }
}