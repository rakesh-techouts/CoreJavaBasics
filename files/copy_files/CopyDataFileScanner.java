package javabasics.files.copy_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyDataFileScanner {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\copy_files\\File1");
            try (FileWriter fw = new FileWriter("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\copy_files\\File2");
                 Scanner sc = new Scanner(f1)) {
                while (sc.hasNextLine()) {
                    String str = sc.nextLine();
                    fw.write(str);
                    fw.write(System.lineSeparator());
                }
            } catch (Exception e) {
                System.err.println("Something went wrong");
            }
    }
}

