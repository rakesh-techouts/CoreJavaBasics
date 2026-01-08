package javabasics.string;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        /*
            it had all Synchronised methods which is thread safe
            it is thread safe
            mutable
            slower than StringBuilder
         */
        //initial capacity 16 if we add 17th character then double the capacity i.e 17*2 = 34
        System.out.println(sb.capacity());
        System.out.println(sb.length());


        sb.append("Hello Rakesh welcome to java!");

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //we can set the capacity
        sb.setLength(28);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        //while printing an object it calls toString() method if not exists className@HexaDecimal code
        System.out.println(sb.toString());

        //String str = sb; gives an error StringBuffer not convert as String
        String s1=sb.toString();
        String s2=""+sb;

        sb.append(78);
        sb.append('c');
        sb.append(98.99f);
        sb.append(" bye Rakesh");
        System.out.println(sb); //Hello Rakesh welcome to java!78c98.99 bye Rakesh
        System.out.println();

        StringBuffer sr = new StringBuffer("Hello Rakesh welcome to java!");

        System.out.println(sr);
        System.out.println(sr.insert(3,'c'));
        System.out.println(sr.insert(6,"Bejjenki "));

        //reverse()
        System.out.println(sb.reverse());



    }
}
