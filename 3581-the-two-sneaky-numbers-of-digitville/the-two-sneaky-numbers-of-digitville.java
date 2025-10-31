class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        int j=0;
        for(int i=0 ; i<nums.length ; i++){
            if(set.contains(nums[i])){
                arr[j] = nums[i];
                j++;
                if(j==2) return arr;
            }
            set.add(nums[i]);
        }
        return arr;
    }
}