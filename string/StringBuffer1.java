package javabasics.string;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(sb1==sb2);// false it checks reference

        System.out.println(sb1.equals(sb2));
        //false because in String class override the equal() method present in Object class
        //so it  checks the content ans return true for Strings
        // but in StringBuffer it does not override so it act like normal ==

        System.out.println(sb1.compareTo(sb2)); //returns 0 if both are equal
        System.out.println(sb1.compareTo(new StringBuffer("HellO"))); //returns positive based on assci value
    }
}
