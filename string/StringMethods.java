package javabasics.string;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello Rakesh";


        //concat()
        System.out.println(str1.concat(" How are you"));

        //toUpperCase()
        System.out.println("toUpperCase: " + str1.toUpperCase());

        //toLowerCase()
        System.out.println("toLowerCase: " + str1.toLowerCase());

        //indexOf()
        System.out.println("Index of R: " + str1.indexOf('R'));
        System.out.println("Index of Rakesh: " + str1.indexOf("Rakesh"));

        //charAt()
        System.out.println("charAt(9): " + str1.charAt(10));

        //length()
        System.out.println("Length: " + str1.length());

        //equals
        String str2 = "HELLO RAKESH";
        System.out.println("Equal to; " + str1.equals(str2));

        //equalIgnoreCase
        System.out.println("Equal to; " + str1.equalsIgnoreCase(str2));

        //replace
        System.out.println("Replace: " + str1.replace('l', 'R'));

        //contains
        System.out.println("Contains: " + str1.contains("l"));

        //trim
        String str3 = "   Hello java  ";
        System.out.println("'" + str3.trim() + "'");

        //valueOf
        //converting Integer to String
        String s = String.valueOf(3456);
        String s1 = Integer.toString(1234);
        String s2 = Float.toString(12.34f);
        System.out.println(s1 + "  " + s + "  " + s2);


        //subString();
        //str.subString(2) prints from index 2 to end of the String
        System.out.println("Substring with one parameter: " + str1.substring(2));

        //str.subString(2,6) prints from index 2 to 6-1(5)  of the String
        System.out.println("Substring with two parameters: " + str1.substring(2, 6));

        //strip()
        String str6 = new String("   Hello mawa   ");
        System.out.println("'" + str6.strip() + "'");
        System.out.println("'" + str6.stripLeading() + "'");
        System.out.println("'" + str6.stripTrailing() + "'");

        System.out.println(str6.toString());

        System.out.println("Substring with two parameters: " + str1.substring(2, 6));
    }
}
