// Last updated: 8/2/2025, 11:31:15 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> sm = new ArrayList<>();
        List<Integer> lar = new ArrayList<>();
        int c=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]<pivot){
                sm.add(nums[i]);
            }else if(nums[i]>pivot){
                lar.add(nums[i]);
            }else{
                c++;
            }
        }
        int i=0;
        for(i=0;i<sm.size(); i++){
            nums[i] = sm.get(i);
        }
        for(;i<sm.size()+c;i++){
            nums[i] = pivot;
        }
        for( ; i<sm.size()+c+lar.size(); i++){
            nums[i] = lar.get(i-c-sm.size());
        }
        return nums;
    }
}