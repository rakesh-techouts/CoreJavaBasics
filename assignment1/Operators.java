package javabasics.assignment1;

public class Operators {
    public static void main(String[] agr){
        //arithmetic operators
        int a=10;
        int b=20;
        System.out.println("Arithmetic Operators");
        System.out.println("a= "+a+" b= "+b);
        System.out.println("addition: "+(a+b));
        System.out.println("subtraction: "+(a-b));
        System.out.println("multiplication: "+(a*b));
        System.out.println("division: "+(b/a));
        System.out.println("modulo: "+(b%3));
        System.out.println();
        //relational operators
        System.out.println("Relational Operators");
        System.out.println("a= "+a+" b= "+b);
        System.out.println("double equals to: "+( a==b));
        System.out.println("less than: "+(a<b));
        System.out.println("greater than: "+(a>b));
        System.out.println("less than or equals to: "+(a<=b));
        System.out.println("greater than or equals to: "+(a>=b));
        System.out.println("not equals to: "+(a!=b));
        System.out.println();
        //Logical operators
        System.out.println("Logical Operators");
        System.out.println("a= "+a+" b= "+b);
        System.out.println("Logical And: "+(a<=10 && b<=20));
        System.out.println("Logical OR: "+(a<10 || b<=20));
        System.out.println("Logical XOR: "+(a<=10 ^ b<=20));
    }
}
/*
AND:
   1 1 -->1
   1 0 -->0
   0 1 -->0
   0 0 -->0

OR:
    1 1 -->1
    1 0 -->1
    0 1 -->1
    0 0 -->0

XOR:
    1 1 -->0
    1 0 -->1
    0 1 -->1
    0 0 -->0
 */