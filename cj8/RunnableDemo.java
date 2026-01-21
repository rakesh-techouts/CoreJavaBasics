package javabasics.cj8;

public class RunnableDemo {
    static void main() {
        Runnable r = () -> {
            for(int i=0;i<5;i++) {
                System.out.println("Iteration: "+i+" "+Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}
