package javabasics.cj6;

public class StringIndexOutOfBound {
    public static void main(String[] args) {
        try {
            String s = "abc";
            System.out.println(s.charAt(5)); // StringIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Error!!: " + e);
        }
    }
}
