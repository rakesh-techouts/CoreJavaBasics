package javabasics.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial capacity: "+sb.capacity());


        sb.append("Hello Rakesh welcome to java!");
        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        /*
            there is similar mechanism for both StringBuilder and StringBuffer
            compare to StringBuffer
            - it is very fast
            - not Synchronised
            - no thread safe
            - suitable for single threaded programs
            - it improve performance
            -methods and working is same
         */
    }
}
