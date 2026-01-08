package javabasics.multi_threading;


class Thread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Iteration: "+i+" "+ Thread.currentThread().getName());
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        Runnable t1 = new Thread1();
        Thread t = new Thread(t1,"Remo_Thread");
        System.out.println(t.getName());
        t.setPriority(1);
        System.out.println(t.getPriority());
        t.start();
        for(int i=0;i<5;i++) {
            System.out.println("Main Thread: "+i+" "+Thread.currentThread().getName());
        }
        System.out.println(t.isAlive()); //false
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getName());
    }
}
