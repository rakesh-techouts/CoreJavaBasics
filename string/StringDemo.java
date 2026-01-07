package javabasics.string;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.hashCode());
        System.out.println(str1.hashCode());

        //it returns true s1 and s2 are refers to same object located in String constan pool
        System.out.println(str1 == str2);

        //it returns true because the content of both is same
        System.out.println(str1.equals(str2));

//       System.out.println(str1 instanceof String); //true
//       System.out.println(str1 instanceof Object); //true
        String str3 = new String("Hello");//stored in heap not in String constant pool
        String str4 = new String("Hello");//stored as new object in heap not in String constant pool

        //hashCode() is based on the content type
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

        //it return false because they both referees to different objects
        System.out.println(str3 == str4);

        //returns true because the content is both same
        System.out.println(str3.equals(str4));


        str3 = str3.intern();
        //now the str3 refers to the constant pool intern help to refers to that
    }
}
