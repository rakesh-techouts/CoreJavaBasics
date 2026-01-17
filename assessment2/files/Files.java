package javabasics.assessment2.files;

import java.io.File;
import java.io.IOException;

public class Files {
    static void main() throws IOException {
        /*
            File is a Class
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
    }
}
