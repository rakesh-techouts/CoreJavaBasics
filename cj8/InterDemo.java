package javabasics.cj8;

public class InterDemo implements Rakesh{
    @Override
    public void show1() {
        System.out.println("This is show1");
    }

    @Override
    public void show2() {
        System.out.println("This is show2");
    }

    static void main() {
        InterDemo d=new InterDemo();
        d.show1();
        d.show2();
    }
}
