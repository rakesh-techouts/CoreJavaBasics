package javabasics.multi_threading;

class Rakesh extends Thread {
    @Override
    public void run() {
        System.out.println("This is "+this.getName());
        System.out.println("Before changing: "+SharedFlag.r);
        SharedFlag.r +=1;
        System.out.println("After changing: "+SharedFlag.r);
    }
}
class SharedFlag {
    static volatile int r = 9;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Rakesh();
        t1.setName("Rakesh");

        Thread t2 = new Rakesh();
        t2.setName("Rakhi");

        t1.start();
        t1.join();
        t2.start();
        Thread.sleep(1000);

    }
}