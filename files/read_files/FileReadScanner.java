package javabasics.files.read_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\File.txt");
        try (Scanner myReader = new Scanner(f1)) {
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something went Wrong");
        }
    }
}