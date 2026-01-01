package javabasics.cj3.break_continue;

public class Break1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }
    }
}
