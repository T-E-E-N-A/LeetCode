// Last updated: 8/2/2025, 11:34:41 PM
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        // added first log as used for starting time in var time 
        String[] s = logs.get(0).split(":");
        // stack : to keep record of order
        Stack<Integer> st = new Stack<>();
        // ans array or frequency or count
        int[] ans = new int[n];
        // starting time initially
        int time = Integer.parseInt(s[2]);
        for(int i=0 ; i<logs.size() ; i++){
            s = logs.get(i).split(":");
            if(time < Integer.parseInt(s[2])){
                ans[st.peek()] += (Integer.parseInt(s[2])-time);
                time = Integer.parseInt(s[2]);
            }
            if(s[1].equals("start")){
                st.push(Integer.parseInt(s[0]));
            }else{
                ans[st.peek()]++;
                time++;
                st.pop();
            }
        }
        return ans;
    }
}