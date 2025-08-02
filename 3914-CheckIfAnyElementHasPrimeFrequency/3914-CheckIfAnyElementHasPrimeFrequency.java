// Last updated: 8/2/2025, 11:28:18 PM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int k:map.keySet())
            if(isPrime(map.get(k)))return true;
        return false;
    }
    public boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2 ;i*i<=n ; i++)
            if(n%i==0)return false;
        return true;
    }
}