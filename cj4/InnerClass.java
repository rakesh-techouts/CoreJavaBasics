package javabasics.cj4;

class OutClass {
    static int outerInstance = 10;

    static class StaticInClass {
        void display() {
            System.out.println("This is static class method");
            System.out.println("Static Inner Class: " + outerInstance);
        }
    }

    class InClass {
        void display() {

            System.out.println("outerInstance = " + outerInstance);
        }
    }


    void display(){
        System.out.println("This is Outer class Method");
    }
}

public class InnerClass {
    public static void main(String[] args) {

        OutClass outer = new OutClass();
        OutClass.InClass inner = outer.new InClass();
        inner.display();
        outer.display();



        OutClass.StaticInClass st= new OutClass.StaticInClass();
        st.display();
    }
}