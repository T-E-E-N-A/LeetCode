class Solution {
    public int minOperations(int[] nums) {
        // increasing stack
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0 ; i<nums.length ; i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
                ans++;
            }
            if(!st.isEmpty() && nums[st.peek()]==nums[i]) continue;
            st.push(i);
        }
        while(!st.isEmpty()){
            if(nums[st.pop()]!=0)
            ans++;
        }
        return ans;
    }
}