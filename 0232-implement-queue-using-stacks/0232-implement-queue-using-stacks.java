class MyQueue {
    Stack<Integer> s1; // main stack
    Stack<Integer> s2; // auxiliary stack

    public MyQueue() { // constructor
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) { // O(1)
        s1.push(x);
    }

    public int pop() { // O(n)
        // transfer all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() { // O(n)
        // transfer all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() { // O(1)
        return s1.isEmpty() && s2.isEmpty();
    }
}