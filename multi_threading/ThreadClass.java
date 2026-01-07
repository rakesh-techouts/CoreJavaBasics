package javabasics.multi_threading;

class Project extends Thread {
    private final String task;

    Project(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task + " is processing by " +
                Thread.currentThread().getName());
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        Thread t1 = new Project("task 1");
        Thread t2 = new Project("task 2");
        Thread t3 = new Project("task 3");
        Thread t4 = new Project("task 4");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
