// Last updated: 8/2/2025, 11:55:22 PM
class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> stack = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        stack.push(val);
        if(st.isEmpty() || val<=st.peek()){
            st.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(st.peek())){
            st.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return st.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */