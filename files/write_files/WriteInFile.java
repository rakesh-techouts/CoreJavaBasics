package javabasics.files.write_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter is for CharacterStream
public class WriteInFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\files\\MyFile.java");
        if(f1.createNewFile()) {
            System.out.println("File Created");
        }else{
            System.err.println("File already existed");
            System.exit(0);
        }
        try (FileWriter fileWriter = new FileWriter(f1)) {
            fileWriter.write("package javabasics.files; class Addition {" +
                    "public static void main(String[] args) {" +
                    "System.out.println(10+20);" +
                    "}" +
                    "}");
        } catch (Exception e) {
            System.err.println("Something went Wrong");
        }
    }
}
