package javabasics.cj5.polymorphism;

class Payment {
    void pay() { System.out.println("Generic payment"); }
}

class CreditCardPayment extends Payment {
    @Override
    void pay() { System.out.println("Paid using Credit Card"); }
}

class UpiPayment extends Payment {
    @Override
    void pay() { System.out.println("Paid using UPI"); }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(); // Output: Paid using UPI
    }
}
/*
Dynamic binding give access mainly to object type not reference
 */
