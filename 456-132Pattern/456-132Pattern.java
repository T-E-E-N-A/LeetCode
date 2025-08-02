// Last updated: 8/2/2025, 11:35:10 PM
class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3) return false;
        Stack<Integer> st = new Stack<>();
        int third = Integer.MIN_VALUE;
        for(int i=nums.length-1 ; i>=0 ; i--){
            // this if will run only when i is found as third has some value which indicated j and k both are already found and searching for i
            if(nums[i]<third) return true;

            // this will run when we have found second so need to update var third
            // nums[i] is second term 
            while(!st.isEmpty() && st.peek()<nums[i]){
                third = Math.max(third,st.pop());
            }
            st.push(nums[i]);
        }
        return false;
    }
}