package javabasics.arrays;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        /*
            Arrays is a class in java.util.Arrays
            We can not create object for Arrays class because it has a private constructor
            it is final class
            it has mostly of static methods which can use by ClassName.methodName
        */
        int[] arr = new int[]{23, 10, 45, 32, 9, 64, 0, 23};
        int[] arr2= new int[]{23, 10, 45, 32, 9, 64, 0, 23};
        System.out.println("Length of Array:" + arr.length);

        //arr is the child class of Object class so it returns true
        System.out.println(arr instanceof Object);

        //Arrays.equals(arr,aar1) checks all the elements in both are same and in same place
        System.out.println(Arrays.equals(arr,arr2));

        //hashcode return the address of the object in heap
        System.out.println("HashCode: "+Arrays.hashCode(arr));

        //toString() methods return the clsssname.methodname@HexmaDecimal code
        System.out.println("toString(): "+arr.toString());
        System.out.println("toString(arr): "+Arrays.toString(arr));

        System.out.println("HashCode before Sort: "+arr.hashCode());
        //Arrays.sort(array)
        Arrays.sort(arr);
        System.out.print("Array after sort: ");
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("HashCode After Sort: "+arr.hashCode());
        System.out.println("toString(arr): "+Arrays.toString(arr));
        System.out.println("Is 19 Present: "+ Arrays.binarySearch(arr,19));
        System.out.println("Is 59 Present: "+ Arrays.binarySearch(arr,59));
        System.out.println("Is 19 Present: "+ Arrays.binarySearch(arr,19));
        System.out.println("Is 59 Present: "+ Arrays.binarySearch(arr,59));
        System.out.println("Is 89 Present: "+ Arrays.binarySearch(arr,89));
        System.out.println("Is 23 Present: "+ Arrays.binarySearch(arr,23));
    }
}
