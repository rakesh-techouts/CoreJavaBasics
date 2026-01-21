package javabasics.cj8;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodRef {
    static void print(Integer i) {
        System.out.println(i);
    }
    void display(Integer i) {
        System.out.println(i);
    }
    MethodRef(Integer i) {
        System.out.println(i);
    }
    MethodRef() {

    }
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        arr.forEach(MethodRef::print); // staticReference ClassName::staticMethodName

        arr.forEach(new MethodRef()::display); // non static method reference  referenceName::nonStaticMethodName
        //arr.forEach(new MethodRef()::print); we cannot refer static with instance

        arr.forEach(MethodRef::new);
    }
}
