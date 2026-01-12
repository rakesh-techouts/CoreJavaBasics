package javabasics.files.basics;

import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\File1.txt");
        if (f1.delete())
            System.out.println("File deleted Successfully");
        else
            System.err.println("File Does not existed");
    }
}
