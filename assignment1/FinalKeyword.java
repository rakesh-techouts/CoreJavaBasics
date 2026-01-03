package javabasics.assignment1;

final class Bunty{
    final static int MAXIMUN=10;
    final void display() {
        System.out.println("This is display method in Bounty class");
    }
    void sleep(){
        System.out.println("This is sleep method in bounty class");
    }
}
//class Hello extends Bunty { }
/*
final classes is not accessed for inheritance they avoid inheritance
final variables are the constats that never change once they assigned
final methods are not override by their sub classes if the parent class is no final
 */
public class FinalKeyword {
    public static void main(String[] args) {
        Bunty b = new Bunty();
        b.display();
        System.out.println("Maximum Values; "+Bunty.MAXIMUN);

        //Bunty.MAXIMUM=20; not possible
        b.sleep();
    }
}
