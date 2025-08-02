// Last updated: 8/2/2025, 11:34:59 PM
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int pre=0;
        for(int i=0 ; i<nums.length ; i++){
            pre = (pre + nums[i])%k;
            if(pre==0 && i!=0){
                return true;
            }
            if(map.containsKey(pre)){
                if(i - map.get(pre) >1){
                    return true;
                }
            }else{
                map.put(pre,i);
            }
        }
        return false;
    }
}