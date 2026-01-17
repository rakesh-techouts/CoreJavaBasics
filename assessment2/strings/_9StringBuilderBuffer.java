package javabasics.assessment2.strings;

public class _9StringBuilderBuffer {
    static void main() {
        String str1 = new String("rakesh");
        String str2 = new String("rakesh");
        System.out.println(str1.equals(str2)); //checks the content
        System.out.println(str1 == str2); //here the reference of the objects are different
       /*
            String is Immutable
            the values are stored in the StringPoll
            provide Thread-safe
            the multiple objects are not create for same values

            StringBuffer is Mutable
            The StringBuffer has pre-defined methods(append(), reverse()...)
            The StringBuilder is synchronized and give Thread-safe
            it is some what slower than the StringBuilder
            mainly it is used for multi-Threading purpose

            StringBuilder is Mutable
            it has same methods as StringBuffer but not synchronized
            it is faster than StringBuffer
            it is used for Single thread and for Performance matters
        */

        StringBuilder sb1 = new StringBuilder("rakesh");
        StringBuilder sb2 = new StringBuilder("rakesh");
        System.out.println(sb1.equals(sb2)); //here the equal method work same as ==
        //because the equals() in string class is override but not StringBuilder and StringBuffer
        System.out.println(sb1 == sb2); //here the reference of the objects are different
        //same for StringBuffer also
    }
}
