package javabasics.cj3.break_continue;

public class BreakExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        for (int num : arr) {
            if (num == 30) {
                System.out.println("Found 30, stopping...");
                break;
            }
            System.out.println(num);
        }
    }
}
