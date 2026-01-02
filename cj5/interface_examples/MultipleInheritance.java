package javabasics.cj5.interface_examples;

interface Add{
    int add(int a,int b);
    default void display() {
        System.out.println("This is Addition purpose");
    }
}

interface Sub{
    int sub(int a,int b);
    default void display() {
        System.out.println("This is Subtraction purpose");
    }
}

class Cal implements Add , Sub
{

    public int add(int a,int b){
        Add.super.display();
        return a+b;
    }

    @Override
    public void display() {
        System.out.println("Over ride Methods for it");
    }

    public int sub(int a,int b){
        Sub.super.display();
        return a-b;
    }
}
public class MultipleInheritance {
    public static void main (String[] args){
        Cal x = new Cal();
        System.out.println("Addition : " + x.add(2,1));
        System.out.println("Substraction : " + x.sub(2,1));
    }
}
