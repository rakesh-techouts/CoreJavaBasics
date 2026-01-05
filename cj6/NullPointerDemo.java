package javabasics.cj6;

public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.charAt(0));
        } catch (NullPointerException n) {
            System.out.println("String is Null!! ");
            System.out.println(n);
        }
    }
}
