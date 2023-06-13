public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));

        arrayList.remove(0);
        System.out.println("ArrayList size after removing element at index 0: " + arrayList.size());

        arrayList.clear();
        System.out.println("ArrayList size after clearing: " + arrayList.size());
        
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("Element A");
        linkedList.add("Element B");
        linkedList.add("Element C");

        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("Element at index 1: " + linkedList.get(1));

        linkedList.remove(0);
        System.out.println("LinkedList size after removing element at index 0: " + linkedList.size());

        linkedList.clear();
        System.out.println("LinkedList size after clearing: " + linkedList.size());

        MyQueue queue = new MyQueue();
        queue.add("Element X");
        queue.add("Element Y");
        queue.add("Element Z");

        System.out.println("Queue size: " + queue.size());
        System.out.println("First element in the queue: " + queue.peek());

        System.out.println("Removing and returning the first element: " + queue.poll());
        System.out.println("Queue size after polling: " + queue.size());

        queue.clear();
        System.out.println("Queue size after clearing: " + queue.size());

        // Приклад використання MyStack
        MyStack stack = new MyStack();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element in the stack: " + stack.peek());

        System.out.println("Popping the top element: " + stack.pop());
        System.out.println("Stack size after popping: " + stack.size());

        stack.clear();
        System.out.println("Stack size after clearing: " + stack.size());

        MyHashMap hashMap = new MyHashMap();
        hashMap.put("Key1", "Value1");
        hashMap.put("Key2", "Value2");
        hashMap.put("Key3", "Value3");

        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("Value for Key2: " + hashMap.get("Key2"));

        hashMap.remove("Key1");
        System.out.println("HashMap size after removing Key1: " + hashMap.size());

        hashMap.clear();
        System.out.println("HashMap size after clearing: " + hashMap.size());
    }
}