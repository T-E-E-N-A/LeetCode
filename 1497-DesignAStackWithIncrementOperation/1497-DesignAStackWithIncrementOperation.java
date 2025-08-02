// Last updated: 8/2/2025, 11:32:46 PM
class CustomStack {
    int i=-1;
    int[] arr;
    public CustomStack(int maxSize) {
        this.arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(i<this.arr.length-1){
            this.arr[++i]=x;
        }
    }
    
    public int pop() {
        if(i>=0)
            return this.arr[i--];
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int j=0 ;j <Math.min(k,i+1) ;j++){
            this.arr[j] = val+arr[j]; 
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
*/