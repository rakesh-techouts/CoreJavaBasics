package javabasics.assessment2.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files {
    static void main() throws IOException {
        /*
            File is a legacy Class
                 it is helps to create , delete and getting information of file
         */
        File f1 = new File("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File4.txt");
        if(f1.createNewFile())  {
            System.out.println("File Created Successfully");
        }else{
            System.out.println("File Already Exists");
        }

        if(f1.exists()) {
            System.out.println("File Name: "+f1.getName());
            System.out.println("File Path: "+f1.getAbsolutePath());
            System.out.println("File Parent Folder: "+f1.getParent());
            System.out.println("Can we Read File: "+f1.getParent());
            System.out.println("Can we Write File: "+f1.canWrite());
            System.out.println("Canonical path: "+f1.getCanonicalPath());
        }

        if(f1.delete())
            System.out.println("File deleted Successfully");

        /*
                Modern Class which is in java.nio.file.Path
                it is very moderate and recover the limitations of File class in java.io
                Files is a class in java.nio.file.Files
                which have static methods to perform the file operations
         */
        Path p1 = Paths.get("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File2.txt");

        System.out.println("File name: " + p1.getFileName());
        System.out.println("Parent: " + p1.getParent());
        System.out.println("Root: " + p1.getRoot());          // C:\
        System.out.println("Is absolute? " + p1.isAbsolute());

        Path normalized = Path.of("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File2.txt").normalize();
        System.out.println("Normalized: " + normalized);

        // Resolve relative paths
        Path base = Path.of("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2");
        Path resolved = base.resolve("files\\File2.txt"); //appending
        System.out.println("Resolved: " + resolved);

    }
}
