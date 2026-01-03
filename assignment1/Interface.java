package javabasics.assignment1;

interface Remo{
    /*
    methods declared in interface is by default public abstract
    variables final static
    we can write static methods and private methods
     */
    void display();
    void show();
    static void print(){
        System.out.println("This is Interface static method");
    }
    default void hello(){
        System.out.println("This is default method in interface");
    }

}
class Promo implements Remo {

    @Override
    public void display() {
        System.out.println("This is Display method implemented in class Promo");
    }

    @Override
    public void show() {
        System.out.println("This is show method implemented in class Promo");
    }
    static void print() {
        System.out.println("This is Promo class Static method");
    }
}
public class Interface {
    public static void main(String[] args){
        Promo p = new Promo();
        p.display();
        p.show();
        p.hello();
        p.display();
        System.out.println();
        Remo r=new Promo();
        r.display();
        r.show();
        r.hello();
        //r.print(); not have access to this method
    }
}
