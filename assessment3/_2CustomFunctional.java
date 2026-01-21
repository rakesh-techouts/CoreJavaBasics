package javabasics.assessment3;

@FunctionalInterface
interface Hello {
    void show(String name, int rollNumber);
}

public class _2CustomFunctional {
    static void main() {
        Hello h = (name, rollNumber) -> System.out.println("Name: " + name + " RollNUmber: " + rollNumber);

        h.show("Rakesh", 523);
        h.show("Vikas", 507);
    }
}
