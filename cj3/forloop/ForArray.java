package javabasics.cj3.forloop;

public class ForArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum=0;
        for (int num : arr) {
            System.out.println(num);
            sum+=num;
        }
        System.out.println("Sum: "+sum);
    }
}

