class MyQueue {
    Stack<Integer> s1; // Main stack
    Stack<Integer> s2; // Auxiliary stack

    public MyQueue() { // Constructor
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) { // O(1)
        // Add new element to the main stack
        s1.push(x);
    }

    public int pop() { // O(n)
        // Transfer all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        // Pop the front element from s2
        return s2.pop();
    }

    public int peek() { // O(n)
        // Transfer all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        // Peek the front element from s2
        return s2.peek();
    }

    public boolean empty() { // O(1)
        // Check if s1 and s2 are empty
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */