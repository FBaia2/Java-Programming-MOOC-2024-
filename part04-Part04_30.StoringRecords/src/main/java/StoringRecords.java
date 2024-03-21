
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Try to open the file
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            // Read each line until all lines have been read
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line on the comma
                String[] parts = line.split(",");

                // Create a new Person object with the name and age
                Person person = new Person(parts[0], Integer.parseInt(parts[1]));

                // Add the person to the list
                persons.add(person);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return persons;
    }
}