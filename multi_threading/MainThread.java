package javabasics.multi_threading;

class MyThread extends Thread {
    private String threadName;
    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            /*
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            */
            System.out.println(threadName + " - Count: " + i);
        }
        System.out.println(threadName + " finished.");
    }
}
public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        // Create thread Objects
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Start the threads
        // for every thread we have to call start() only once
        thread1.start();
        thread1.join();
        //join() helps to wait all threads until the execution is completed of this thread

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();
        for(int i =0 ;i<5;i++) {
            System.out.println("Main Thread: "+i);
        }
        System.out.println("All threads have finished.");
    }
}