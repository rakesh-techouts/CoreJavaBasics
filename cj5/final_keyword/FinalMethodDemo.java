package javabasics.cj5.final_keyword;


class FinalDemo {
    // create a final method
    public final void display() {
        System.out.println("This is a final method.");
    }
}

public class FinalMethodDemo  extends FinalDemo {
    // try to override final method .. final methods are not over ridden
    /*public final void display() {
        System.out.println("The final method is overridden.");
    }*/

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}