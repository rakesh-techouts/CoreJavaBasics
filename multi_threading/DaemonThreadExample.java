package javabasics.multi_threading;

public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {

        User userThread = new User();
        userThread.start();
        Daemon daemonThread = new Daemon();
        daemonThread.setDaemon(true); // set before start()
        daemonThread.start();





        System.out.println("[Main] Main thread exiting...");
    }
}
class Daemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon Running background task...");
            try {
                for(int i=0;i<3;i++) {
                    System.out.println("This is Demon Thread");
                    if(i==2)
                        Thread.currentThread().sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("[Daemon] Interrupted");
                break;
            }
        }
    }
}

class User extends Thread {
    @Override
    public void run() {
        System.out.println("User Doing important work...");
        for(int i=0;i<3;i++) {
            System.out.println("This is Demon Thread");
        }
        System.out.println("[User] Finished important work.");
    }
}

