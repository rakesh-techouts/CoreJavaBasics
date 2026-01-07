package javabasics.multi_threading;


class PriorityDemo extends Thread {
    public PriorityDemo(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " Priority: " + getPriority() + " Count: " + i);
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("LowPriorityThread");
        PriorityDemo t2 = new PriorityDemo("NormalPriorityThread");
        PriorityDemo t3 = new PriorityDemo("HighPriorityThread");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
