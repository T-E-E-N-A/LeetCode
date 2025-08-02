// Last updated: 8/2/2025, 11:35:04 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        int j=0;
        for(int i=0 ; j<2*nums.length ; i=(i+1)%nums.length){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                // jb tk nikaalo tb tk bda hai
                ans[st.pop()] = nums[i];
            }
            if(j<nums.length)
                st.push(i);
            j++;
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}