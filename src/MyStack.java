import java.util.NoSuchElementException;

public class MyStack {
    private Object[] array;
    private int top;
    private int size;

    public MyStack() {
        array = new Object[10];
        top = -1;
        size = 0;
    }

    public void push(Object value) {
        if (size == array.length) {
            increaseCapacity();
        }
        top++;
        array[top] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < top; i++) {
            array[i] = array[i + 1];
        }
        array[top] = null;
        top--;
        size--;
    }

    public void clear() {
        array = new Object[10];
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        return array[top];
    }

    public Object pop() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        Object value = array[top];
        array[top] = null;
        top--;
        size--;
        return value;
    }

    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}