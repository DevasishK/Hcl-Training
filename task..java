import java.io.*;
import java.nio.file.*;

package com.hcl.filehandling;


// Custom Exception
class FileOperationException extends Exception {
    public FileOperationException(String message) {
        super(message);
    }
    
    public FileOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Public class for file operations
public class FileHandler {
    
    // Private file path
    private String filePath;
    
    // Protected constructor
    protected FileHandler(String filePath) {
        this.filePath = filePath;
    }
    
    // Public method to write data to file
    public void writeToFile(String data) throws FileOperationException {
        try {
            Files.write(Paths.get(filePath), data.getBytes(), 
                StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new FileOperationException("Failed to write to file: " + filePath, e);
        }
    }
    
    // Public method to read data from file
    public String readFromFile() throws FileOperationException {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new FileOperationException("Failed to read from file: " + filePath, e);
        }
    }
    
    // Public main method
    public static void main(String[] args) {
        try {
            FileHandler handler = new FileHandler("data.txt");
            handler.writeToFile("Hello, HCL Task!");
            String content = handler.readFromFile();
            System.out.println("File content: " + content);
        } catch (FileOperationException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}