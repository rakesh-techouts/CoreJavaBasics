package javabasics.files.copy_files;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CopyByFileInputStream {
    public static void main(String[] args) throws IOException {

        try(FileInputStream fin = new FileInputStream("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\copy_files\\File2");
            FileWriter fw = new FileWriter("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\copy_files\\MultiplicationTable.java")){
            int b;
            while((b=fin.read()) != -1) {
                fw.write((char)b);
            }

        }catch (Exception e) {
            System.err.println("Something went Wrong");
        }
    }
}
