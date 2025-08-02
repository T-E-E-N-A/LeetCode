// Last updated: 8/2/2025, 11:33:58 PM
class StockSpanner {
    Stack<Integer> st;
    List<Integer> li = new ArrayList<>();
    int i=0;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        while(!st.isEmpty() && (li.get(st.peek())<=price)){
            st.pop();
        }
        li.add(price);
        int ans=i+1;
        if(!st.isEmpty())
            ans = i-st.peek();
        st.push(i++);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */