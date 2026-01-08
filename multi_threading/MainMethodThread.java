package javabasics.multi_threading;

public class MainMethodThread{
    public static void main(String[] args) {
        //we can change the main thread name
        System.out.println("Initial Name: "+Thread.currentThread().getName());
        Thread.currentThread().setName("Rakesh");
        System.out.println("Current Name: "+Thread.currentThread().getName());

        //we can change the main method priority
        System.out.println("Initial priority: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Current priority: "+Thread.currentThread().getPriority());
    }
}
