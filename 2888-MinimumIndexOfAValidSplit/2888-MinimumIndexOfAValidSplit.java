// Last updated: 8/2/2025, 11:30:08 PM
class Solution {
    public int minimumIndex(List<Integer> nums) {
        // moore voote method/approach to find majority element
        int major = findMin(nums);
        int i=0;
        int n = nums.size();
        int vote=0,ans=-1;
        for(i=0 ;  i<n ; i++){
            if(nums.get(i)==major){
                vote++;
            }else{
                vote--;
            }
            if(vote==1){
                ans = i;
                break;
            }
        }
        vote=0;
        for( i++; i<n ; i++){
            if(nums.get(i)==major){
                vote++;
            }else{
                vote--;
            }
        }
        if(vote>0){
            return ans;
        }
        return -1;
    }
    public int findMin(List<Integer> nums){
        int vote=0;
        int ele = nums.get(0);
        for(int i=0 ; i<nums.size() ; i++){
            if(ele==nums.get(i)){
                vote++;
            }else{
                vote--;
            }
            if(vote==0){
                ele = nums.get(i);
                vote++;
            }
        }
        return ele;
    }
}