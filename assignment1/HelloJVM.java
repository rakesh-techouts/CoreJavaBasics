package javabasics.assignment1;

public class HelloJVM {
    public static void main(String[] args) {
        System.out.println("HelloJVM");
    }
}

/*
    Source File : HelloJVM.java
    when we compile the java source file program using command javac HelloJVM.java
    the java compiler compile the programs and check Syntax error and Other errors
    if the program compile successfully the compiler create a .class file with ClassName.class
    here, HelloJVM.class in same directory . class file contains ByteCode
    then execute the .class file by using command java HelloJVM
    then JVM executes the program.
                                        (ByteCode)
    SourceFile-----> java compiler---->HelloJVM.class----> JVM ---->execute program
        |
        HelloJVM.java

 */