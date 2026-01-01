package javabasics.cj3.break_continue;


public class EmptyNameArray {
    public static void main(String[] args) {
        String[] names = {"Raj", "", "Sam", "Rakesh"};
        for (String name : names) {
            if (name.isEmpty()) continue;
            System.out.println("Name: " + name);
        }
    }
}
