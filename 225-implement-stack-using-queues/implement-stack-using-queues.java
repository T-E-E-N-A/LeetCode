class MyStack {
    Queue<Integer> qu;
    public MyStack() {
        qu = new LinkedList<>();
    }
    
    public void push(int x) {
        qu.add(x);
        // 1 iteration less in loop which leaves newest on bottom
        for(int i=1 ; i<qu.size() ; i++){
            // rempving from first adding at last for (n-1) elements
            qu.add(qu.poll());
        }

    }
    
    public int pop() {
        return qu.poll();
    }
    
    public int top() {
        return qu.peek();
    }
    
    public boolean empty() {
        return qu.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */