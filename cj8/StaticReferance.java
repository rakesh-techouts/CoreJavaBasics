package javabasics.cj8;

import java.util.Arrays;

class Chello{
    static void print(String name) {
        System.out.print(name+" ");
    }
    void println(String name) {
        System.out.println(name);
    }
}
public class StaticReferance {
    static void main() {
        Chello chello = new Chello();
        String[] ar={"Ram","Rak","Rakesh","Vikas","Sam"};
        Arrays.stream(ar).forEach(Chello::print);

        System.out.println();
        Arrays.stream(ar).forEach(chello::println);
    }
}
