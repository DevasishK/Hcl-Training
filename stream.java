import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Filter names that start with 'A' or 'D'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("D"))
                .collect(Collectors.toList());

        // Print filtered names
        System.out.println("Filtered Names: " + filteredNames);

        // Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print uppercase names
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Count names with more than 3 letters
        long count = names.stream()
                .filter(name -> name.length() > 3)
                .count();

        // Print count
        System.out.println("Count of names with more than 3 letters: " + count);

        // Reduce to concatenate names
        String concatenatedNames = names.stream()
                .reduce("", (name1, name2) -> name1 + name2 + " ");

        // Print concatenated names
        System.out.println("Concatenated Names: " + concatenatedNames.trim());
    }
}