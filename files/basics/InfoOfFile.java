package javabasics.files.basics;

import java.io.File;

public class InfoOfFile {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\File.txt");
        if (f1.exists()) {
            System.out.println("File Information...");
            //get name of file
            System.out.println("File Name: " + f1.getName());
            //get file path
            System.out.println("File path: " + f1.getAbsolutePath());
            //length of file
            System.out.println("File length: " + f1.length());
            //can write
            System.out.println("Can write in the File?: " + f1.canWrite());
            //can read
            System.out.println("Can Read in the File?: " + f1.canRead());
        }else{
            System.err.println("File Does not exist");
        }
    }
}
