package javabasics.multi_threading;


public class CurrentThreadExp extends Thread
{
    public void run()
    {
        // print currently executing thread
        for(int i=0;i<5;i++) System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        // creating two thread
        Thread t1=new CurrentThreadExp();
        t1.setName("Demo");
        CurrentThreadExp t2=new CurrentThreadExp();
        t2.setName("Remo");
        // this will call the run() method
        t1.start();
        t2.start();
    }
}