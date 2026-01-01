package javabasics.cj4.static_keyword;

class Demo {
    static int value;

    static {
        value = 10;
        System.out.println("Static block executed");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(Demo.value);
    }
}
