package javabasics.cj6;

public class ThrowsDemo {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[] {10,20,30,40};
        System.out.println(arr[4]);
    }
}
// use the specific class name if have an idea about the error occurs in the specific method
// throws are applied at the be side of the method signature