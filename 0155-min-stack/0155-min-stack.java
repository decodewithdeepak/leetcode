class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public MinStack() {
        // constructor
    }

    public void push(int val) {
        if (st.size() == 0) {
            st.push(val);
            minSt.push(val);
        } else {
            st.push(val);
            if (val < minSt.peek())
                minSt.push(val);
            else
                minSt.push(minSt.peek());
        }
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
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