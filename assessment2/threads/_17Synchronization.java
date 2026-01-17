package javabasics.assessment2.threads;

public class _17Synchronization extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Iteration in run: " + i + " by " + Thread.currentThread().getName());
        }
        try {
            show();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (this) {
            for (int i = 1; i < 5; i++) {
                System.out.println("Iteration in run Synchronised block: " + i + " by " + Thread.currentThread().getName());
            }
        }
    }

    public synchronized static void show() throws InterruptedException {
        for (int i = 1; i < 5; i++) {
            System.out.println("Iteration in Show: " + i + " by " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }

    static void main() {
        Thread t1 = new _17Synchronization();
        t1.setName("Thread -A");
        Thread t2 = new _17Synchronization();
        t2.setName("Thread -B");

        t1.start();
        t2.start();
    }
}
/*
Iteration in run: 1 by Thread -B
Iteration in run: 1 by Thread -A
Iteration in run: 2 by Thread -B
Iteration in run: 2 by Thread -A
Iteration in run: 3 by Thread -A
Iteration in run: 4 by Thread -A
Iteration in run: 3 by Thread -B
Iteration in run: 4 by Thread -B
Iteration in Show: 1 by Thread -A
Iteration in Show: 2 by Thread -A
Iteration in Show: 3 by Thread -A
Iteration in Show: 4 by Thread -A
Iteration in Show: 1 by Thread -B
Iteration in run Synchronised block: 1 by Thread -A
Iteration in run Synchronised block: 2 by Thread -A
Iteration in run Synchronised block: 3 by Thread -A
Iteration in run Synchronised block: 4 by Thread -A
Iteration in Show: 2 by Thread -B
Iteration in Show: 3 by Thread -B
Iteration in Show: 4 by Thread -B
Iteration in run Synchronised block: 1 by Thread -B
Iteration in run Synchronised block: 2 by Thread -B
Iteration in run Synchronised block: 3 by Thread -B
Iteration in run Synchronised block: 4 by Thread -B
 */