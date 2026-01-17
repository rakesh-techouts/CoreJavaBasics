package javabasics.assessment2.threads;

class A implements Runnable {
    @Override
    public void run() {
        System.out.println("Run method in Runnable Extended Class A");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration :" + i + "  by " + Thread.currentThread().getName());
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration :" + i + "  by " + Thread.currentThread().getName());
        }
    }
}

public class _16ThreadCreation {
    static void main() throws InterruptedException {
        Runnable objA = new A();
        Thread t1 = new Thread(objA, "Thread -A");
        Thread t2 = new B();
        t2.setName("Thread -B");
        t1.start();
        t1.join(); //main method wait() until t1 complete its execution
        t2.start();
    }
}
/*
    we can create Thread in two ways
    by extending Thread class
        if we extend Thread class their is no chance to extends another class
        (Multiple- inheritance not supported by java directly)
        so if we extends only for Thread behavior then go with these
        and further the extended class does not extends another  Class
    by implementing Runnable Interface
         it is a Functional Interface which have only one abstract method ru()
         we can extends another classes to
         class A extends B implements Runnable{....}//Possible

         Runnable interface does no have any thread qualities we again covert it into the thread
         Only the Runnable references can convert as Thread
 */