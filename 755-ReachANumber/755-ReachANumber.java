// Last updated: 8/2/2025, 11:34:26 PM
class Solution {
    public int reachNumber(int target) {
        if(target==1 || target==-1){
            return 1;
        }else if(target==0){
            return 0;
        }
        int sum=0;
        if(target<0){
            target = 0-target;
        }
        for(int i=1 ; i<2*target ; i++){
            sum+=i;
            if(sum>target && (sum-target)%2==0){
                return i;
            }
            if(sum==target){
                return i;
            }
        }
        return -1;
    }
}