package javabasics.files.basics;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\File2.txt");
        if (f1.createNewFile()) {
            System.out.println("File created Successfully with name: " + f1.getName());
        } else {
            System.out.println("File Existed Already with name: " + f1.getName());
        }
    }
}
