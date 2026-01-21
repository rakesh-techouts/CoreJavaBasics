package javabasics.cj8;


import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        /*
            to print the elements in an collection we use
            for(Integer i:list) { System.out.println(i); } //Enchanced for loop
            for(int i=0; i<list.size(); i++) { System.out.println(list.get(i)); } //normal for loop

            but these are External Loops for Collections
            it take some time complexity
            so forEach() is introduced in java8

            forEach() is take Consumer Interface reference as a parameter
            Consumer is a FunctionInterface with Consumer<T> with single abstract method called accept<T t>
             we can implement those by with LambdaExpressions and MethodReference
         */
        arr.forEach(i-> System.out.println(i));// LambdaExpression for Consumer Interface
        arr.forEach(System.out::println);// method reference

        //forEach() method is in Iterable Interface so Every Collection has it
        //forEach() methods is also in Stream Interface
    }
}
