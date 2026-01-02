package javabasics.cj5.final_keyword;

class FinalExample {
    public static void main(String[] args) {

        // create a final variable
        final int AGE = 32;

        // try to change the final variable
        //AGE = 45; gives error final is not modify once declare
        System.out.println("Age: " + AGE);
    }
}