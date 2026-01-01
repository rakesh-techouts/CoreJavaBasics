package javabasics.cj4.static_keyword;

public class StaticVariable {
        static int age;
        public static void main(String[] args){
            StaticVariable.age = 23;
            System.out.println("S1's age is: " + age);
            System.out.println("S2's age is: " + StaticVariable.age);
        }
}

