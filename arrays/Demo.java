package javabasics.arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,30};
        System.out.println(arr.getClass());

        System.out.println(arr.hashCode());

        float[] arr1 = new float[] {10,20,30};
        System.out.println(arr1.getClass());

        System.out.println(arr1.hashCode());
    }
}
