package javabasics.assignment1;

class Super{
    String name;
    Super(String name){
        this();// calling default constructor in current class
        this.name=name; //accessing instance variables
        System.out.println("This is Super constructor");
    }
    Super(){
        System.out.println("This is Zero parametrized Super constructor");
    }
    void display(){
        System.out.println("My name is : "+name);
    }
}
class Sub extends Super {
    Sub(String name){
        super(name);//super constructor with single parameter
        System.out.println("This is SuB constructor");
    }

    @Override
    void display() {
        super.display();// super class method
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Sub s= new Sub("Rakesh");
        s.display();
    }
}
