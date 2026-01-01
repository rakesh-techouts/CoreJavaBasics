package javabasics.cj4.constructor;

class Demo{
    String name;
    int id;

    // Parameterized Constructor
    Demo(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    Demo(Demo obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
public class Copy {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor
        System.out.println("First Object");
        Demo d1 = new Demo("Sweta", 68);
        System.out.println("GeekName: " + d1.name
                + " and GeekId: " + d1.id);

        System.out.println();

        // This would invoke the copy constructor
        Demo d2 = new Demo(d1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName: " + d2.name
                + " and GeekId: " + d2.id);
    }
}