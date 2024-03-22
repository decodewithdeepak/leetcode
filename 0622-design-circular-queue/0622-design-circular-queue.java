class MyCircularQueue {
    int[] q;
    int front, rear, size, capacity;

    public MyCircularQueue(int k) { // Constructor
        q = new int[k];
        front = 0;
        rear = -1;
        size = 0;
        capacity = k;
    }

    public boolean enQueue(int value) { // O(1)
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        q[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() { // O(1)
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() { // O(1)
        if (isEmpty()) {
            return -1;
        }
        return q[front];
    }

    public int Rear() { // O(1)
        if (isEmpty()) {
            return -1;
        }
        return q[rear];
    }

    public boolean isEmpty() { // O(1)
        return size == 0;
    }

    public boolean isFull() { // O(1)
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */