package javabasics.cj7.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        //System.out.println(queue.remove()); RuntimeException
        for(int i=10;i<=20;i++) {
            queue.add(i);
        }
        //Head element must and should sort
        //
        System.out.println(queue);
        queue.add(1);
        System.out.println(queue);


        Queue<String> q = new PriorityQueue<>();
        q.add("Rakhi");
        q.add("Rakesh");
        q.add("Bejjenki");
        q.add("Rak");
        System.out.println("Queue: "+q);
        System.out.println("Size of the Queue: "+q.size());

        System.out.println("Peek Element in Queue: "+q.peek());
        System.out.println("Poll the Element: "+q.poll());// return the first value and remove
        System.out.println(q);

        if(q.contains("Rak")) {
            q.remove("Rak");
        }
        System.out.println(q);

//        q.add(null);
//        System.out.println(q); throws NullPointerException


    }
}
