package javabasics.cj5.abstract_class;

// Java Program to implement Abstract Class
// having constructor, data member, and methods
import java.io.*;

abstract class Subject {
    Subject() {
        System.out.println("Learning Subject");
    }

    abstract void syllabus();

    void learn(){
        System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {
    IT() {
        System.out.println("This is It Constructor");
    }
    void syllabus(){
        System.out.println("C , Java , C++");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Subject x=new IT();

        x.syllabus();
        x.learn();
    }
}