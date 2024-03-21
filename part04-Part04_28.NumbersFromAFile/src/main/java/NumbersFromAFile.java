
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        ArrayList<String> numbs = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        Integer lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        Integer upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                numbs.add(sc.nextLine());
            }
            for (String i : numbs) {
                Integer ii = Integer.valueOf(i);
                if (ii >= lowerBound && ii <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}