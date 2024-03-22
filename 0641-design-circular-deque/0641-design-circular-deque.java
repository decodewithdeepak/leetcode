class MyCircularDeque {

    int[] q;
    int front, rear, size, capacity;

    public MyCircularDeque(int k) { // Constructor
        q = new int[k];
        front = 0;
        rear = -1;
        size = 0;
        capacity = k;
    }

    public boolean insertFront(int value) { // O(1)
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        q[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) { // O(1)
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        q[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() { // O(1)
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() { // O(1)
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() { // O(1)
        if (isEmpty()) {
            return -1;
        }
        return q[front];
    }

    public int getRear() { // O(1)
        if (isEmpty()) {
            return -1;
        }
    return q[(rear + capacity) % capacity];
    }

    public boolean isEmpty() { // O(1)
        return size == 0;
    }

    public boolean isFull() { // O(1)
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */