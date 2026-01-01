package javabasics.cj2.switchex;


public class SwitchAdvanced {
    public static void main(String[] args) {
        int day = 6;
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
