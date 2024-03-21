
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        // we create a scanner for reading the file
        try (Scanner sc = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
                counter++;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (counter != 0) {
            for (String line : lines) {
                if (line.equals(searchedFor)) {
                    System.out.println("Found!");
                    counter2++;
                    break;
                }

            }
            if (counter2 == 0) {
                System.out.println("Not found!");

            }

        } else {
            System.out.println("Reading the file " + file + " failed.");
        }

    }

}
