package javabasics.assessment3;

interface Remo {
    void show();

    default void display() {
        System.out.println("This is Default display calling private static display");
        Remo.displlay();
    }

    private static void displlay() {
        System.out.println("This is private static display method");
    }
}

public class _14CallingStaticMethod implements Remo {
    static void main() {
        Remo r = new _14CallingStaticMethod();
        r.display();
        r.show();
    }

    @Override
    public void show() {
        System.out.println("This is Implemented show method");
    }
}
