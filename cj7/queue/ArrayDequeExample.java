package javabasics.cj7.queue;


import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // we can use for both Queue and Stack (FIFO) (LIFO) double ended Queue
        // Adding elements at the end (Queue behavior)
        deque.add("A");
        deque.add("B");
        deque.add("C");
        System.out.println("Initial Deque: " + deque);

        // Adding at the front
        deque.addFirst("First");
        // Adding at the end
        deque.addLast("Last");

        System.out.println("After addFirst & addLast: " + deque);

        // Removing from front
        String front = deque.removeFirst();
        System.out.println("Removed First: " + front);

        // Removing from end
        String last = deque.removeLast();
        System.out.println("Removed Last: " + last);

        System.out.println("Final Deque: " + deque);
    }
}
