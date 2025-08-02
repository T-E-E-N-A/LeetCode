// Last updated: 8/2/2025, 11:56:28 PM
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for(int i=0 ;i<arr.length ; i++){
            if(arr[i].equals(".")) continue;
            if(arr[i].equals("..")){
                if(!st.isEmpty()) st.pop();
                continue;
            }
            if(arr[i].length()==0) continue;
            st.push(i);
        }
        Stack<Integer> help = new Stack<>();
        while(!st.isEmpty()) help.push(st.pop());
        while(!help.isEmpty()){
            ans.append("/");
            ans.append(arr[help.pop()]);
        }
        if(ans.length()==0) return "/";
        return ans.toString();
    }
}