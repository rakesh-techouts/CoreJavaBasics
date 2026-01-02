package javabasics.cj5.polymorphism;


public class MainOverloading {
    public static void main(int[] args){
        System.out.println("This is Demo class Other main");
    }
    public static void main(String[] args){
        System.out.println("This is Demo class Main");
        int[] arr={1,2,3};
        MainOverloading.main(arr);
    }
}
