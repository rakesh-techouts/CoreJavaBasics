package javabasics.assignment1;


import java.lang.ref.WeakReference;

class DemoObject {
    private String name;
    DemoObject(String name) {
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called for: " + name);
    }
}
public class SimpleGCDemo {
    public static void main(String[] args) {
        System.out.println("Starting ...");

        // Create an object and a WeakReference to it
        DemoObject obj = new DemoObject("MyObject");
        WeakReference<DemoObject> weakRef = new WeakReference<>(obj);

        System.out.println("Before : WeakRef points to: " + weakRef.get());

        obj = null;

        System.out.println("Calling System.gc()...");
        System.gc();

        // Give GC some time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After: WeakRef points to: " + weakRef.get());
        System.out.println("completed.");
    }
}
