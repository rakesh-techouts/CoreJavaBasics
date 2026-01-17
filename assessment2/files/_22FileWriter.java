package javabasics.assessment2.files;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _22FileWriter {
    static void main() throws IOException {

        try (FileWriter fw = new FileWriter("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File2.txt");
             Scanner sc = new Scanner(System.in)) {
            System.out.println("Write the Content and Ends With 'END' Symbol");
            String line = "";
            while (!((line = sc.nextLine()).equalsIgnoreCase("END"))) {
                fw.write(line);
                fw.write(System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
