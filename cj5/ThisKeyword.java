package javabasics.cj5;

class Geeks {
    int a;
    int b;

    //Same name Instance and local variables managing
    Geeks(int a, int b) {
        //calling constructor for another
        this("Rakesh");
        this.a = a;
        this.b = b;
    }
    Geeks(String name) {
        System.out.println("My name is: "+name);
    }
    void display(Geeks obj) {
        System.out.println("a = " + obj.a + "  b = " + obj.b);
        obj.display();
    }

    void get() {
        //passing object to method
        display(this);
    }

    void display() {
        System.out.println("Hello");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Geeks object = new Geeks(10, 20);
        object.get();
    }
}
