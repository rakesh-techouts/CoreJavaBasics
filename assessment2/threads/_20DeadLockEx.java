package javabasics.assessment2.threads;

class Remo{
    int signel=0;
    public synchronized void fun() throws InterruptedException {
        while(signel==1){
            wait();
        }
        //signel=1;
        System.out.println("This is fun");
        //notify();
    }
    public synchronized void bun() throws InterruptedException {
        while (signel==0){
            wait();
        }
        signel=0;
        System.out.println("This is bun");
        notify();
    }
}

public class _20DeadLockEx {
    static void main() {
        Remo r = new Remo();
        Thread t1 = new Thread(()-> {
                try{
                    for(int i=0;i<3;i++) {
                       r.fun();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }});
        Thread t2 = new Thread(()-> {
            try{
                for(int i=0;i<3;i++) {
                    r.bun();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }});
        t1.start();
        t2.start();
    }
}
/*
    in the above single indicates the Entry point for both Threads
    and for intercommunication
    t1 executes but it not give single to t2 and not notify
    here the t2 is waiting() keeps on waiting
    the program never terminated here


    if we write Thread.currentThread().join  ---> it leads to Deadlock and program never terminated
    join() is to wait() the current thread and execute the other thread but
    here we are saying to wait() a Thread to execute that Thread
 */