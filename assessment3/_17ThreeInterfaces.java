package javabasics.assessment3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _17ThreeInterfaces {
    static void main() {
        Predicate<String> isBig = s -> s.length() > 5;
        //Predicate has test(T) method it returns boolean value

        Consumer<Integer> con = System.out::println;
        //it has void accept(T t) to terminal purpose

        Function<String, Integer> lengthOf = String::length;
        //take to parameters and one is input type parameter and another is return type parameter
        //if Function(R,T) it as --->  T apply(R r) method
        String[] str = new String[]{"Rakesh", "Vikas", "Ram", "Karthikk"};
        for (String s : str) {
            if (isBig.test(s)) {
                System.out.print(s+" :");
                con.accept(lengthOf.apply(s));
            }
        }
    }
}
