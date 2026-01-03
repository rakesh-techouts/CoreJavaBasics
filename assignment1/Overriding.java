package javabasics.assignment1;


class Parent {
    void display(){
        System.out.println("This is Display method in Parent");
    }
    void show() {
        System.out.println("This is Show method in Parent");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("This is Child Display method Override by parent display");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        c.show();


        Parent p =new Parent();
        p.display();
        p.show();
    }
}
