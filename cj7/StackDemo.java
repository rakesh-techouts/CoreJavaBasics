package javabasics.cj7;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack");
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while(true){
            System.out.printf("%n1.Push%n2.Pop%n3.Display%n4.Exit%nEnter your choice:%n");
            int choice = sc.nextInt();
            if(choice>4 || choice<1){
                System.err.println("Invalid choice"); continue;
            }
            if(choice==4) break;
            switch (choice) {
                case 1:
                    if(stack.size()==10){
                        System.err.println("Stack Overflow Flow"); break;
                    }
                    System.out.println("Enter the Value to push: ");
                    int element= sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    if(stack.size()==0){
                        System.err.println("Stack Under Flow"); break;
                    }
                    System.out.println("Element is poped: "+stack.pop());
                    break;
                case 3:
                    if(stack.size()==0){
                        System.err.println("No elements to display"); break;
                    }
                    System.out.println("***Elements in Stack***");
                    for(Integer i:stack) {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
