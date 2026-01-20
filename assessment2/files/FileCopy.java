package javabasics.assessment2.files;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Files;

public class FileCopy  {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File1");
        Path target = Paths.get("C:\\Users\\Rakesh.B\\IdeaProjects\\techoutsJava\\src\\javabasics\\assessment2\\files\\File4.txt");

        try {
            // Create parent dirs if they don't exist
            if (target.getParent() != null) {
                Files.createDirectories(target.getParent());
            }
            Files.copy(source, target, StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("Copied successfully to: " + target);
        } catch (NoSuchFileException e) {
            System.err.println("Source file not found: " + source);
        } catch (FileAlreadyExistsException e) {
            System.err.println("Target already exists: " + target + " (use REPLACE_EXISTING to overwrite)");
        } catch (IOException e) {
            System.err.println("I/O error during copy: " + e.getMessage());
        }
    }
}

