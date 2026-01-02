package javabasics.cj5.abstract_class;

abstract class Outer {
    abstract void outerDisplay();
    void display(){
        System.out.println("This is Outer Display method");
    }
    abstract static class Inner{
        abstract void innerDisplay();
        void display(){
            System.out.println("This is inner Display method");
        }
    }
}

/*
class Out extends Outer {
    @Override
    void outerDisplay() {
        System.out.println("This is Over ride method of Outer class ");
    }
    class In extends Inner {
        @Override
        void innerDisplay() {
            System.out.println("This is Over ride method of Outer class ");
        }
    }
}
*/
class Out extends Outer {
    @Override
    void outerDisplay() {
        System.out.println("This is Over ride method of Outer class ");
    }
}
class In extends Outer.Inner {
    @Override
    void innerDisplay() {
        System.out.println("This is Over ride method of Outer class ");
    }
}
public class AbstractNestedClasses {
    public static void main(String[] args) {
        Outer o = new Out();
        o.outerDisplay();
        o.display();

        Outer.Inner i = new In();
        i.innerDisplay();
        i.display();
    }
}
