package javabasics.cj5.final_keyword;

// create a final class
final class FinalClass {
    public void display() {
        System.out.println("This is a final method.");
    }
}

// try to extend the final class
//public class FinalClassDemo extends FinalClass { not possible for inherit the final class
public class FinalClassDemo {
    public  void display() {
        System.out.println("The final method is overridden.");
    }
    public static void main(String[] args) {
        FinalClassDemo obj = new FinalClassDemo();
        obj.display();
    }
}