package javabasics.cj2.switchex;

public class Switch {
    public static void main(String[] args) {
        String fruit = "banana";

        int calories = switch (fruit) {
            case "apple" -> 95;
            case "banana" -> 105;
            case "orange" -> 62;
            default -> 0;
        };

        System.out.println("Calories: " + calories);
    }
}
