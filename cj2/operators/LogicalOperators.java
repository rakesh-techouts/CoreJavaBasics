package javabasics.cj2.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean and = 10 < 20 && 10 < 30;
        System.out.println(and);
        boolean or = 10>20 || 10==5;
        System.out.println(or);
        boolean not= 10!=10;
        System.out.println(not);
    }
}
