class StockSpanner {
    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int days = 1;
        while (!st.isEmpty() && st.peek()[0] <= price) {
            days += st.pop()[1];
        }
        st.push(new int[] { price, days });
        return days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */