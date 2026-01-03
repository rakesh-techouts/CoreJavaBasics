package javabasics.assignment1;

public class PrimitiveDataTypes {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char ch;
    boolean bool;
    void displayDefaultValuesOfPrimitiveDataTypes(){
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("char: "+ch);
        System.out.println("boolean: "+bool);
    }
    public static void main(String[] args) {
        PrimitiveDataTypes pt = new PrimitiveDataTypes();
        pt.displayDefaultValuesOfPrimitiveDataTypes();
    }
}
