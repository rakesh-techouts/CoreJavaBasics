package javabasics.cj7.list;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
//        Collection<Integer> stack= new Stack<>(); we can use the methods in Collection
//        List<Integer> stack = new Stack<>(); we can use the methods in List
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack Before Pop: "+stack);
        //Stack follows LIFO so 40 is pop
        int gone=stack.pop();
        System.out.println("poped Element: "+gone);
        System.out.println("Stack After Pop: "+stack);

        stack.add(10); //push and same
        System.out.println(stack);

        stack.addFirst(80);//make it as first In
        System.out.println(stack);

        stack.pop();//remove last in
        System.out.println(stack);

        stack.addLast(100); //same as push
        System.out.println(stack);
    }
}
