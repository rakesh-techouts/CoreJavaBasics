package javabasics.files.read_files;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderClass {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\copy_files\\MultiplicationTable.bin");
        int a ;
        while((a=r.read()) != -1) {
            System.out.print((char)a);
        }
    }
}
/*
package javabasics.files.copy_files;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printTable(int num) {
        System.out.println("***Multiplication Table***");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();
            printTable(num);
        } catch (Exception e) {
            System.err.println("Something went Wrong");
        }

    }
}
 */