package javabasics.string;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        System.out.println("HashCode Before concat: " + str1.hashCode());
        str1.concat("World");

        System.out.println("HashCode After but applicable: " + str1.hashCode());
        System.out.println(str1); //Hello

        str1 = str1.concat(" World");
        System.out.println("HashCode After: " + str1.hashCode());
        System.out.println(str1);
    }
}
