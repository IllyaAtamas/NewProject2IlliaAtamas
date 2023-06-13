import java.util.NoSuchElementException;

public class MyQueue {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        private Object value;
        private Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void clear() {
        while (front != null) {
            Node nextNode = front.next;
            front.value = null;
            front.next = null;
            front = nextNode;
        }
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.value;
    }

    public Object poll() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object value = front.value;
        front.value = null;
        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}