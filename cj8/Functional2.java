package javabasics.cj8;


public class Functional2 {
    static void main() {
        Thread t1 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Iteration: "+i+" "+Thread.currentThread().getName());
            }
        });

        t1.setName("Thread -A");


        Thread t2 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Iteration: "+i+" "+Thread.currentThread().getName());
            }
        });
        t2.setName("Thread -B");

        t1.start();
        t2.start();
    }
}
