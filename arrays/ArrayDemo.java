package javabasics.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
            Array is an non primitive data type which extends an java.lang.Object class
            it is also treat as an object in java
            since it is an object the instance of Array is stored in Heap
            ths store only same datatype of elements in it
            the memory is fixed if once it allocated
            ArrayIndexOutOfBoundException will occur if we want to access the illegal index element
            it has
                1D array
                2D array ...
        */
        //1D array
        int[] arr = new int[4]; // four is the size of array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        //arr[4]=50; not possible because we have to insert four elements in to it with index 0 to 3
        int[] arr1 = new int[]{10, 20, 30, 40};
        arr1[3] = 20;
        /*
        in Array the elements may modify and allows duplicates
         */
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[][] arr2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(arr2);
        //since arr2 is treat as an object so while we print an object it executes toString() method
        // if it does to have any method java.lang.Object is added and print memory location
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //jagged array
        int[][] arr3 = new int[4][];
        arr3[0] = new int[6];
        arr3[1] = new int[4];
        arr3[2] = new int[10];
        arr3[3] = new int[2];
        //When we created an array by default the initial values
        // are zeros for int,byte ,short,long,null for string
        for(int[] i:arr3){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
