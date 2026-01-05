package javabasics.cj6;

public class ThrowsException {
    public static void main(String[] args) throws Throwable { // we cna use "throws Exception" also
        int[] arr = new int[]{10, 20, 30};
        for (int i = 0; i <= 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
// here we have only 3 elements with indexing 0,1,2
// but we want to access the index 3 element which does not exist
// so it leads to ArrayIndexOUtOfBoundEXception