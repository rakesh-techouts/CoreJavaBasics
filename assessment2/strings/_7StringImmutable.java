package javabasics.assessment2.strings;

public class _7StringImmutable {
    public static void main(String[] args) {
        String str = "Tech";
        System.out.println("Before Concat: " + str);//Tech
        System.out.println("Before concat: " + str.hashCode());
        str.concat(" Outs");
        System.out.println("After Concat: " + str);//Tech
        System.out.println("After Concat : " + str.hashCode());
        /*
            When we create String it checks weather the value present in String poll
            if present just refer to that value
            if not allocate the separate memory for the value in the String pool
            String can't change if once assign a value
            if we want to change the value it creates a new object in another location

         */
        str = str.concat(" Outs");
        System.out.println("After Concat: " + str);//Tech
        System.out.println("After: " + str.hashCode());
    }
}
