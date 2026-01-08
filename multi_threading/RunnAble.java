package javabasics.multi_threading;

class A{
    void show() {
        System.out.println("This is show method");
    }
}
class DemoThread extends A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public void start() {
        System.out.println("This is Start method");
    }
}
public class RunnAble {
    public static void main(String[] args) {
        //DemoThread d = new DemoThread();
        //Thread d = new DemoThread();

        Thread d = new Thread(new DemoThread());
        d.start(); //it implicitly calls the run method
        //d.run(); it also class run method but the thread qualities are not applicable
        //d.show(); d.start();
        // if there is methods in the class like this their are not executed and unable to call bu the thread object

        /*
        DemoThread d = new DemoThread();
        d.start();
        d.run();
        d.show(); it is possible but it executes as a normal class
        */
    }
}
