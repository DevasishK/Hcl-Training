import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("abc.txt");
            writer.write("hello\n");
            writer.write("srm\n");
            writer.close();
            System.out.println("File created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String filename, String[] lines) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for (String line : lines) {
            writer.write(line + "\n");
        }
        writer.close();
    }
}