package javabasics.cj6;


public class FinallyDemo {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        try {
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues...");
    }
}