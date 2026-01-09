package javabasics.multi_threading;

public class Demo extends Thread{
    @Override
    public void run() {
        System.out.println("This is a Thread");
    }

    public static void main(String[] args) {
        Thread t = new Demo();
        t.stop();
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        System.out.println(t.getState());
        t.start();
        System.out.println(t.isAlive());
    }
}
