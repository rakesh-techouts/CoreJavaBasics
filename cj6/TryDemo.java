package javabasics.cj6;

public class TryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("This is try block");
        } finally {
            System.out.println("This is finally block");
        }
        /*
                -single try is not possible
                -try with catch or try with finally must
                -try can have any number of catch blocks
                -one try has only one finally
                -finally not mandatory to write
                -finally is for close connections and opened files
                -try catch and finally possible
                -finally is executed irrespective of error occurrence
         */
    }
}
